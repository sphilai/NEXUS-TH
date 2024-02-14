#!/bin/sh
##################################################################################################
# Copyright(C) 2014 Software Research Associates, Inc. All Rights Reserved.
#
# Package Name : migcasemark.sh
# Description  : 
# SFD          : 
# Version      : 1.0
#
# Program List
# ------------------------------ ---- ----- ------------------------------------------------------
#  Name                          Type  Ret   Description
# ------------------------------ ---- ----- ------------------------------------------------------
#  migstock                       P          Registration of TT_TMP_STOCK/仮在庫情報を登録する
#
# Parameter List
# ------------------------------ ---- ----- ------------------------------------------------------
#  Name                          Type  Ret   Description
# ------------------------------ ---- ----- ------------------------------------------------------
#  The first argument         IN         shipper code
#  The second argument        IN         progress information output interval
#  第1引数                        IN         シッパーコード
#  第2引数                        IN         ログ出力件数
#
# Change Record
# ------------- ----- ------------ ---------------------------------------------------------------
#  Date          Ver.  Editor       Description
# ------------- ----- ------------ ---------------------------------------------------------------
#  2014-02-XX    1.0   K.Shimizu    initial creation
##################################################################################################
DEBUG="set -x"
${DEBUG}

#
# Interrupt control
# 割り込み制御
#
trap "echo $0 catch signal." 1 2 3 15

OWNDIR="`dirname $0`"

. ${OWNDIR}/.nexus.ini          # share constant reading/NEXUS 共有定数読込
. ${OWNDIR}/.mig_stock.ini      # setting for this shell/仮在庫情報登録処理用定数読込
. ${OWNDIR}/func/log.fnc

##################################################################################################
# Process start
# 処理開始
BATCH='Registration TT_TMP_STOCK'

# To redefine LOGFILE, the LOGGER variable in order to create a log file in the directory of each sub-system.
# サブシステムごとのディレクトリにログファイルを作成するために
# LOGFILE, LOGGER 変数を再定義する．
ChangeLogFile

# Record the start of batch processing to the log file.
# バッチ処理の開始をログファイルに記録する．
OutPutLog "[INFO ] ${BATCH} Start."
OutPutLog "[INFO] 【 ${BATCH} 】を開始します。"

#
# Check rguments
# 引数チェック
#
OutPutLog '[INFO] +++ Check rguments'
OutPutLog '[INFO] +++ 引数チェック'
if [ "${ARGC}" != "${PRA}" ] ;then
    # Argument checking error
    # 引数チェックエラー
    OutPutLog "[ERROR] There is a mistake in the argument."
    OutPutLog "[ERROR]   The first argument: shipper code"
    OutPutLog "[ERROR]   The second argument: Progress information output interval"
    OutPutLog "[ERROR] 引数に間違いがあります。"
    OutPutLog "[ERROR]   第1引数：シッパーコード"
    OutPutLog "[ERROR]   第2引数：ログ出力件数"
    exit 2
fi


#
# Set argument
# 引数セット
#
OutPutLog '[INFO] +++ Set argument'
OutPutLog '[INFO] +++ 引数セット'
SHIPPER=$1 # shipper code/シッパーコード
LOGCNT=$2  # progress information output interval/ログ出力件数

#
# Registration TT_TMP_STOCK
# PL/SQL procedure execution
# 仮在庫情報を登録
# PL/SQLプロシージャ実行
#
OutPutLog '[INFO] +++ Registration TT_TMP_STOCK(PL/SQL procedure execution)'
OutPutLog '[INFO] +++ 仮在庫情報を登録(PL/SQLプロシージャ実行)'
${SQLPLUS} -s ${USR}/${PWD}@${DBNAME} >> ${LOGFILE} 2>&1 <<EOD
SET SERVEROUT ON
variable retcd varchar2(10);
execute migstock(:retcd, '${SHIPPER}', ${LOGCNT});
EOD

#
# End.
# 終了
#
OutPutLog "[INFO] ${BATCH} End."
OutPutLog "[INFO] 【 ${BATCH} 】を終了します。"

exit 0
