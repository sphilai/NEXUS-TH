#!/bin/bash
# ****************************************************************************
# ** [JP]  ファイル名 : aijbLogServerStop.sh                                     **
# ** [JP]  処理概要   : AijbLogServerの停止                                      **
# ** [JP]                                                                       **
# ** [JP]    killコマンドを使用してAijbLogServerのプロセスを強制終了します。     **
# ** [JP]                                                                       **
# ** [JP]    AijbLogServerの停止ログを出力するためにAijbLogServerクラスを        **
# ** [JP]    引数:stopで実行します。                                             **
# ** [JP]                                                                       **
# ** [JP]  引数       : なし                                                     **
# ** [JP]  戻り値     : 0(正常終了)/16(異常終了)                                 **
# **                                                                        **
# ** [EN]  File name             : aijbLogServerStop.sh                                     **
# ** [EN]  Outline of processing : Stop AijbLogServer                                      **
# ** [EN]                                                                       **
# ** [EN]    We stop to confirm AijbLogServer service using kill command.        **
# ** [EN]                                                                       **
# ** [EN]    In order to stop the log output of AijbLogServer,                   **
# ** [EN]    I run AijbLogServer class argument:stop.                            **
# ** [EN]                                                                       **
# ** [EN]  Argument     : None                                                   **
# ** [EN]  Return value : 0(Stopping services)/16(Exit Warning)                  **
# **                                                                        **
# ** ---------------------------------------------------------------------- **
# ** [JP]  変更履歴   : 2012/01/23 新規作成                                      **
# ** [JP]             : 2012/12/04 プロセス名短縮対応(チケット136)               **
# **                                                                        **
# ** [EN]  Change history : 2012/01/23 Create new                                        **
# ** [EN]                 : 2012/12/04 Process name corresponding reduction (Ticket 136) **
# **                                                                        **
# **  $ aijbLogServerStop.sh 4409 2013-05-23 01:46:18Z hiroko_nagata@dnitsol.com $
# **                                                                        **
# ****************************************************************************

# [JP] ==== 環境に応じて各自で設定してください ====================================
# [EN] ==== Depending on your environment, please set your own ====================================
# [JP] ==== パラメータ設定 ========================================================
# [EN] ==== Setting Parameters ========================================================
# ----------------------------------------------------------------------------
# [JP]  JAVA_XMX       ： AijbLogServerの最大ヒープサイズ(MB)
# [JP]  JAVA_XMS       ： AijbLogServerの初期ヒープサイズ(MB)
# [EN]  JAVA_XMX       ： Maximum heap size of AijbLogServer (MB)
# [EN]  JAVA_XMS       ： Initial heap size of AijbLogServer (MB)
# ----------------------------------------------------------------------------
JAVA_XMX=32
JAVA_XMS=32

# [JP] ==== 起動クラスの設定 ======================================================
# [EN] ==== Setting the startup class ======================================================
EXECUTE_CLASS=com.globaldenso.ai.aijb.core.util.AijbLogServer

# [JP] ==== log4jの設定 ===========================================================
# [EN] ==== Setting the log4j ===========================================================
LOG_XML=log4jServer.xml

# [JP] ==== 共通環境変数の設定 ====================================================
# [EN] ==== Setting common environment variables ====================================================
PRGDIR=`dirname $0`
. ${PRGDIR}/setenv.sh
if [ $? -ne 0 ]; then
# [JP] ==== 共通環境変数設定失敗 ログ出力 戻り値を16に設定 ========================
# [EN] ==== Failure of common environment variables  Log output  The return value is set to 16 ========================
    echo [boot] [`date "+%Y/%m/%d %T"`] [ERROR] setenv.sh Execute Failed >> ${PRGDIR}/aijbLogServerStop.log
    exit 16
fi

# [JP] ==== ログ出力先設定 ========================================================
# [EN] ==== Log output destination setting ========================================================
LOGFILE=${AIJB_DIR}/logs/aijbLogServerStop.log

# [JP] ==== 処理開始ログ出力 ======================================================
# [EN] ==== Log output process starts ======================================================
echo `date "+%Y/%m/%d %T"` INFO :START AijbLogServer StopBatch >> $LOGFILE 2>&1

# [JP] ==== PSコマンドによるサービス停止確認 ======================================
# [EN] ==== Confirm the stopping of the service by the PS command ======================================
echo `date "+%Y/%m/%d %T"` INFO :Start CheckProcess >> $LOGFILE 2>&1
PROCESS_CNT=`ps -ef | grep java | grep $EXECUTE_CLASS | grep start | grep -v grep | wc -l`
echo `date "+%Y/%m/%d %T"` INFO :End   CheckProcess >> $LOGFILE 2>&1

# [JP] ==== 既にサービスが停止している場合、ログに出力し処理終了 ==================
# [EN] ==== If the service is already stopped, the end of processing the log ==================
if [ $PROCESS_CNT -eq 0 ]; then
    echo `date "+%Y/%m/%d %T"` WARN :AijbLogServer service was already stopped. >> $LOGFILE 2>&1
    echo `date "+%Y/%m/%d %T"` INFO :END AijbLogServer StopBatch >> $LOGFILE 2>&1
    echo -------------------------------------------------------------------------------- >> $LOGFILE 2>&1
    exit 0
fi

# [JP] ==== サービス停止ログ出力。この処理でサービスは停止しない) ==================
# [EN] ==== Stop logging service. This process does not stop service) ==================
echo `date "+%Y/%m/%d %T"` INFO :Start logoutput command >> $LOGFILE 2>&1
export CLASSPATH
${JAVA_HOME}/bin/java -Xrs -Xmx${JAVA_XMX}m -Xms${JAVA_XMS}m -Dlog4j.configuration=${LOG_XML} ${EXECUTE_CLASS} stop >> $LOGFILE 2>&1
# [JP] ==== サービス停止ログ出力が異常終了の場合 ===================================
# [EN] ==== If exit warning is stop logging of service ==============================================
if [ $? -ne 0 ]; then
    echo `date "+%Y/%m/%d %T"` ERROR :Stop AijbLogServer service log output process, an error occurred. >> $LOGFILE 2>&1
    echo `date "+%Y/%m/%d %T"` INFO :I will continue to Stop process AijbLogServer services. >> $LOGFILE 2>&1
fi
echo `date "+%Y/%m/%d %T"` INFO :End   logoutput command >> $LOGFILE 2>&1

# [JP] ==== 処理実行 ==============================================================
# [EN] ==== Process execution ==============================================================
echo `date "+%Y/%m/%d %T"` INFO :Start stop command >> $LOGFILE 2>&1
# [JP] ==== プロセスID取得 ========================================================
# [EN] ==== Acquisition process ID ========================================================
PID=`ps -ef | grep java | grep $EXECUTE_CLASS | grep start | grep -v grep | awk '{ print $2; }'`
# [JP] ==== プロセスkill実行(ここでサービスが停止する) ============================
# [EN] ==== Kill process execution (Service stops here) ============================
kill -9 $PID >> $LOGFILE 2>&1
echo `date "+%Y/%m/%d %T"` INFO :I kill PID $PID.>> $LOGFILE 2>&1
echo `date "+%Y/%m/%d %T"` INFO :End   stop command >> $LOGFILE 2>&1

# [JP] ==== 処理終了ログ出力 ======================================================
# [EN] ==== End of processing logging output ======================================================
echo `date "+%Y/%m/%d %T"` INFO :END AijbLogServer StopBatch >> $LOGFILE 2>&1
echo -------------------------------------------------------------------------------- >> $LOGFILE 2>&1 
exit
