#!/bin/bash
# ****************************************************************************
# ** [JP]  ファイル名 : aijbResidentJobLauncher_with_wily.sh
# ** [JP]  処理概要   : 常駐ジョブを起動する共通のバッチです。(wily起動オプションつき)
# ** [JP]
# ** [JP]    AijbMainControllerから起動する全ての常駐ジョブは
# ** [JP]    このバッチから起動させます。
# ** [JP]
# ** [JP]    javaコマンド起動時の以下のオプションはwily導入環境にあわせて変更してください。
# ** [JP]   -Dcom.wily.introscope.agentProfile
# ** [JP]   -javaagent
# ** [JP]
# ** [JP]   【引数】
# ** [JP]      $1 : ジョブで使用する Spring 設定ファイル(フルパス)
# ** [JP]          例) /com/globaldenso/ai/aijb/job/queuecreate/jobcontrol/applicationContext-queuecreate.xml
# ** [JP]
# ** [JP]      $2 : 実行するジョブID
# ** [JP]
# ** [JP]      $3 : 実行するキューID
# **
# ** [EN]  File name             : aijbResidentJobLauncher_with_wily.sh
# ** [EN]  Outline of processing : It is common batch resident job to start. (with startup options wily)
# ** [EN]
# ** [EN]    All resident job to boot from AijbMainController is to boot from this batch.
# ** [EN]
# ** [EN]    The following options at startup java command, please change to suit your wily deployment environment.
# ** [EN]   -Dcom.wily.introscope.agentProfile
# ** [EN]   -javaagent
# ** [EN]
# ** [EN]   【Argument】
# ** [EN]      $1 : Spring configuration file for the job (Full path)
# ** [EN]          Example) /com/globaldenso/ai/aijb/job/queuecreate/jobcontrol/applicationContext-queuecreate.xml
# ** [EN]
# ** [EN]      $2 : Job ID to execute
# ** [EN]
# ** [EN]      $3 : Queue ID to execute
# **
# ** ----------------------------------------------------------------------
# ** [JP]  変更履歴   : 2012/01/23 新規作成
# ** [JP]             : 2012/11/19 ログ出力先フォルダ権限付与 JP1ユーザ対応(チケット130)
# ** [JP]             : 2012/12/04 プロセス名短縮対応(チケット136)
# ** [JP]             : 2013/01/31 ジョブ起動時のOutOfMemoryエラー対応(チケット188)
# **
# ** [EN]  Change history : 2012/01/23 Create new
# ** [EN]                 : 2012/11/19 Authorization log output destination folder  JP1 user support (Ticket 130)
# ** [EN]                 : 2012/12/04 Process name corresponding reduction (Ticket 136)
# ** [EN]                 : 2013/01/31 Corresponding OutOfMemory Error When Starting Job (Ticket 188)
# **
# **  $ aijbResidentJobLauncher_with_wily.sh 7360 2014-03-17 01:09:00Z HIDETOSHI_NAKATANI@denso.co.jp $
# **
# ****************************************************************************


# [JP] ==== 環境に応じて各自で設定してください ================
# [EN] ==== Depending on your environment, please set your own ================
# [JP] ==== パラメータ設定 ====================================
# [EN] ==== Setting Parameters ====================================
# --------------------------------------------------------
# [JP]  JAVA_XMX      ： ジョブの最大ヒープサイズ(MB)
# [JP]  JAVA_XMS      ： ジョブの初期ヒープサイズ(MB)
# [JP]  JAVA_PERMSIZE ： ジョブのPermanent領域サイズ(MB)
# [JP]  EXECUTE_CLASS ： ジョブを起動するクラス
# [JP]  LOG_XML       ： ログ出力設定ファイル
# [EN]  JAVA_XMX      ： Maximum heap size of the job (MB)
# [EN]  JAVA_XMS      ： Initial heap size of the job (MB)
# [EN]  JAVA_PERMSIZE ： Permanent region size of the job (MB)
# [EN]  EXECUTE_CLASS ： Class to start the job
# [EN]  LOG_XML       ： Logging configuration file
# --------------------------------------------------------
JAVA_XMX=192
JAVA_XMS=192
JAVA_PERMSIZE=40

# [JP] ==== ジョブ起動クラスの設定 ============================
# [EN] ==== Setting classes starting job ============================
EXECUTE_CLASS=com.globaldenso.ai.aijb.core.job.control.ResidentProcMain

# [JP] ==== log4jの設定 =======================================
# [EN] ==== Setting the log4j =======================================
LOG_XML=log4jJob.xml

# [JP] ==== 共通環境変数の設定 ================================
# [EN] ==== Setting common environment variables ================================
PRGDIR=`dirname $0`
. ${PRGDIR}/setenv.sh
if [ $? -ne 0 ]; then
# [JP] ==== 共通環境変数設定失敗 ログ出力 戻り値を16に設定 ====
# [EN] ==== Failure of common environment variables  Log output  The return value is set to 16 ====
    echo [boot] [`date "+%Y/%m/%d %T"`] [ERROR] setenv.sh Execute Failed >> ${PRGDIR}/$2.log
    exit 16
fi


# [JP] ==== ログ出力先フォルダ確認/作成 =======================
# [EN] ==== Create / Confirmation log output destination folder =======================
if [ ! -d ${BATCH_LOG_DIR} ]; then
    mkdir -p ${BATCH_LOG_DIR}
    chmod 777 ${BATCH_LOG_DIR}
fi

# [JP] ==== ログ出力先フォルダ確認/作成(ジョブID単位) =========
# [EN] ==== Create / Confirmation log output destination folder (Unit Job ID) =========
if [ ! -d ${BATCH_LOG_DIR}/$2 ]; then
    mkdir -p ${BATCH_LOG_DIR}/$2
    chmod 777 ${BATCH_LOG_DIR}/$2
fi

# [JP] ==== ジョブ起動 ========================================
# [EN] ==== Starting job ========================================
export CLASSPATH
${JAVA_HOME}/bin/java -Xrs -Xmx${JAVA_XMX}m -Xms${JAVA_XMS}m -XX:PermSize=${JAVA_PERMSIZE}m -Dlog4j.configuration=${LOG_XML} -Dcom.wily.introscope.agentProfile=/opt/wily9.1/wily/core/config/IntroscopeAgent.profile -javaagent:/opt/wily9.1/wily/Agent.jar ${EXECUTE_CLASS} $1 $3 >> ${BATCH_LOG_DIR}/$2/$3.log
exit