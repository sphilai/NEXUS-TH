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
#  migcasemark                    P          パレタイズテーブルよりパラメータのケースマークNo.リストに
#                                            存在しないレコードを消し込む。
#                                            delete TT_PLTZ a record that does not exist in the case mark No. list of parameters
#
# Parameter List
# ------------------------------ ---- ----- ------------------------------------------------------
#  Name                          Type  Ret   Description
# ------------------------------ ---- ----- ------------------------------------------------------
#  The first argument         IN         shipper code
#  The second argument        IN         Full path of unshipped case mark information (CSV)
#  The third argument         IN         progress information output interval
#  第1引数                        IN         シッパーコード
#  第2引数                        IN         未出荷ケースマーク情報(CSV)のフルパス
#  第3引数                        IN         ログ出力件数
#
# Change Record
# ------------- ----- ------------ ---------------------------------------------------------------
#  Date          Ver.  Editor       Description
# ------------- ----- ------------ ---------------------------------------------------------------
#  2014-02-XX    1.0   K.Shimizu    initial creation
##################################################################################################
#DEBUG="set -x"
${DEBUG}

#
# Interrupt control
# 割り込み制御
#
trap "echo $0 catch signal." 1 2 3 15

OWNDIR="`dirname $0`"

. ${OWNDIR}/.nexus.ini          # share constant reading/NEXUS 共有定数読込
. ${OWNDIR}/.migcasemark.ini    # setting for this shell/未出荷ケースマーク情報マッチング処理用定数読込
. ${OWNDIR}/func/log.fnc

##################################################################################################
# Process start
# 処理開始
BATCH='Case mark matching'

# To redefine LOGFILE, the LOGGER variable in order to create a log file in the directory of each sub-system.
# サブシステムごとのディレクトリにログファイルを作成するために
# LOGFILE, LOGGER 変数を再定義する．
ChangeLogFile

# Record the start of batch processing to the log file.
# バッチ処理の開始をログファイルに記録する．
OutPutLog "[INFO ] ${BATCH} Start."
OutPutLog "[INFO ] 【 ${BATCH} 】を開始します。"


#
# Check rguments
# 引数チェック
#
#OutPutLog '[INFO ] +++ 引数チェック'
if [ "${ARGC}" != "${PRA}" ] ;then
    # Argument checking error
    # 引数チェックエラー
    OutPutLog "[ERROR] There is a mistake in the argument."
    OutPutLog "[ERROR]   The first argument: the full path of the export orders information (CSV)"
    OutPutLog "[ERROR]   The second argument: Full path of unshipped case mark information (CSV)"
    OutPutLog "[ERROR]   The third argument: Progress information output interval"
    OutPutLog "[ERROR] 引数に間違いがあります。"
    OutPutLog "[ERROR]   第1引数：シッパーコード"
    OutPutLog "[ERROR]   第2引数：未出荷ケースマーク情報(CSV)のフルパス"
    OutPutLog "[ERROR]   第3引数：ログ出力件数"
    exit 2
fi


#
# Set argument
# 引数セット
#
#OutPutLog '[INFO ] +++ 引数セット'
SHIPPER=$1 # shipper code/シッパーコード
FILENM=$2  # full path of unshipped case mark information (CSV)/未出荷ケースマーク情報(CSV)ファイル(フルパス)
LOGCNT=$3  # progress information output interval/ログ出力件数


#
# unshipped case mark information (CSV) file existence check
# 未出荷ケースマーク情報(CSV)ファイルの存在チェック
#
#OutPutLog '[INFO ] +++ 未出荷ケースマーク情報(CSV)ファイルの存在チェック'
${LS} ${FILENM} > /dev/null 2>&1
if [ "$?" != "0" ] ;then
    # Presence check error of unship case mark information (CSV) file
    # 未出荷ケースマーク情報(CSV)ファイルの存在チェックエラー
    OutPutLog "[ERROR] There are no unshipped case mark information (CSV) file."
    OutPutLog "[ERROR] Please check the unshipped case mark information (CSV) file."
    OutPutLog "[ERROR] 未出荷ケースマーク情報(CSV)ファイルがありません。"
    OutPutLog "[ERROR] 未出荷ケースマーク情報(CSV)ファイルを確認してください。"
    exit 2
fi


#
# Copy of unshipped case mark information (CSV)
# 未出荷ケースマーク情報(CSV)のコピー
#
#OutPutLog '[INFO ] +++ 未出荷ケースマーク情報(CSV)のコピー'
cp ${FILENM} ${DATFILE}


#
# Case mark information matching information registration
# SQL*Loader start
# ケースマーク情報マッチング情報登録
# SQL*Loader 起動
#
#OutPutLog '[INFO ] +++ ケースマーク情報マッチング情報登録(SQL*Loader)'
${SQLLDR} ${USR}/${PWD}@${DBNAME} control=${CTLFILE} DIRECT=Y log=${SQLLDRLOG} > /dev/null 2>&1


#
# SQL*Loader error checking
# SQL*Loader エラーチェック
#
#OutPutLog '[INFO ] +++ ケースマーク情報マッチング情報登録エラーチェック(SQL*Loader)'
if [ "$?" != "0" ] ;then
    # SQL*Loader error checking
    # SQL*Loader エラーチェック
    OutPutLog "[ERROR] An error has occurred in the SQL*Loader."
    OutPutLog "[ERROR] Please check the log file."
    OutPutLog "[ERROR] Log file : "${SQLLDRLOG}
    OutPutLog "[ERROR] BAD file : "${BADFILE}
    OutPutLog "[ERROR] SQL*Loader でエラーが発生しました。"
    OutPutLog "[ERROR] ログファイルを確認してください。"
    OutPutLog "[ERROR] ログファイル : "${SQLLDRLOG}
    OutPutLog "[ERROR] BAD ファイル : "${BADFILE}
    exit 2
fi


#
# Case mark information matching
# PL/SQL procedure execution
# ケースマーク情報マッチング
# PL/SQLプロシージャ実行
#
#OutPutLog '[INFO ] +++ ケースマーク情報マッチング(PL/SQLプロシージャ実行)'
${SQLPLUS} -s ${USR}/${PWD}@${DBNAME} >> ${LOGFILE} 2>&1 <<EOD
SET SERVEROUT ON
variable retcd varchar2(10);
execute migcasemark(:retcd, '${SHIPPER}', ${LOGCNT});
EOD

#
# End
# 終了
#
OutPutLog "[INFO ] ${BATCH} End."
OutPutLog "[INFO ] 【 ${BATCH} 】を終了します。"

exit 0
