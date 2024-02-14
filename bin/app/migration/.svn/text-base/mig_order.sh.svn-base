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
#  mig_order                      P          load TT_EXP_RCV_ODR/輸出受注情報の取り込を行う
#
# Parameter List
# ------------------------------ ---- ----- ------------------------------------------------------
#  Name                          Type  Ret   Description
# ------------------------------ ---- ----- ------------------------------------------------------
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
. ${OWNDIR}/.mig_order.ini      # setting for this shell/受注情報の取り込を行う
. ${OWNDIR}/func/log.fnc

##################################################################################################
# Process start
# 処理開始
BATCH='Load TT_EXP_RCV_ODR'

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
    OutPutLog "[ERROR]   The second argument: Progress information output interval"
    OutPutLog "[ERROR] 引数に間違いがあります。"
    OutPutLog "[ERROR]   第1引数：輸出受注情報(CSV)のフルパス"
    OutPutLog "[ERROR]   第2引数：ログ出力件数"
    exit 2
fi


#
# Set argument
# 引数セット
#
#OutPutLog '[INFO ] +++ 引数セット'
FILENM=$1  # Export orders information (CSV) file (full path)/輸出受注情報(CSV)ファイル(フルパス)
LOGCNT=$2  # Progress information output interval/ログ出力件数


#
# Presence check of export orders information (CSV) file
# 輸出受注情報(CSV)ファイルの存在チェック
#
#OutPutLog '[INFO ] +++ 輸出受注情報(CSV)ファイルの存在チェック'
${LS} ${FILENM} > /dev/null 2>&1
if [ "$?" != "0" ] ;then
    # Presence check error of export orders information (CSV) file
    # 輸出受注情報CSV)ファイルの存在チェックエラー
    OutPutLog "[ERROR] There is no export orders information (CSV) file."
    OutPutLog "[ERROR] Please check the export orders information (CSV) file."
    OutPutLog "[ERROR] 輸出受注情報(CSV)ファイルがありません。"
    OutPutLog "[ERROR] 輸出受注情報(CSV)ファイルを確認してください。"
    exit 2
fi


#
# Copy of the export orders information (CSV)
# 輸出受注情報(CSV)のコピー
#
#OutPutLog '[INFO ] +++ 輸出受注情報(CSV)のコピー'
cp ${FILENM} ${DATFILE}


#
# TT_EXP_RCV_ODR registration
# 輸出受注情報登録
# SQL*Loader start
# SQL*Loader 起動
#
#OutPutLog '[INFO ] +++ 輸出受注情報登録(SQL*Loader)'
${SQLLDR} ${USR}/${PWD}@${DBNAME} control=${CTLFILE} DIRECT=Y log=${SQLLDRLOG} > /dev/null 2>&1


#
# SQL*Loader error checking
# SQL*Loader エラーチェック
#
#OutPutLog '[INFO ] +++ 輸出受注情報登録エラーチェック(SQL*Loader)'
if [ "$?" != "0" ] ;then
    # SQL*Loader error
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
# End
# 終了
#
OutPutLog "[INFO ] ${BATCH} End."
OutPutLog "[INFO ] 【 ${BATCH} 】を終了します。"

exit 0

