#!/bin/bash
# ****************************************************************************
# **
# ** [JP]   ファイル名 : reruncml.sh
# ** [JP]   処理概要   : 移行ステップ1でチェックエラーとなった処理を再実行します。
# ** [JP]
# ** [JP]       テーブル TW_CASE_MARK_HDR_IF にケースマークNo.が登録されていることが条件です。
# ** [JP]       登録されていない場合エラーとなります。
# ** [JP]
# ** [JP]   【引数】
# ** [JP]       $1 : ケースマークNo.
# ** [JP]       ...
# **
# ** [EN]   File name             : reruncml.sh
# ** [EN]   Outline of processing : Migration step 1 I will re-run the process became a check error.
# ** [EN]
# ** [EN]       Case No. mark in table TW_CASE_MARK_HDR_IF that has been registered is the condition.
# ** [EN]       It is an error if they are not registered.
# ** [EN]
# ** [EN]   [Argument]
# ** [EN]       $1 : Case mark No.
# ** [EN]       ...
# **
# ** ----------------------------------------------------------------------
# **
# ** [JP]  変更履歴   : 2014/11/04 新規作成
# ** [EN]  Change history : 2014/11/04 Create new
# **
# **  $id$
# **
# ****************************************************************************

# [JP] ==== 環境に応じて各自で設定してください ================
# [EN] ==== Depending on your environment, please set your own ================
# [JP] ==== パラメータ設定 ====================================
# [EN] ==== Setting Parameters ====================================
# --------------------------------------------------------
# [JP]  JAVA_HOME      : JDKをインストールしたディレクトリ
# [JP]  LIB_DIR        : Webサービス(REST)呼出部品が使用するjarを配置したディレクトリ
# [JP]  CONF_DIR       : Webサービス(REST)呼出部品が使用する設定ファイルを配置したディレクトリ
# [JP]  LOG_XML        : Webサービス(REST)呼出部品が使用するlog4j設定ファイル
# [EN]  JAVA_HOME      : Directory where you installed the JDK
# [EN]  LIB_DIR        : Directory where you placed the jar for use with ai-webservicecallrest
# [EN]  CONF_DIR       : Directory where you placed the configration file for use with ai-webservicecallrest
# [EN]  LOG_XML        : Log4j configuration file for use with ai-webservicecallrest
# --------------------------------------------------------
JAVA_HOME=/opt/jdk/jdk1.8.0_20
LIB_DIR=/data/AIJB/module/lib
CONF_DIR=/data/AIJB/module/config
LOG_XML=`dirname $0`/log4j.xml

# [JP] ==== 環境に応じて各自で設定してください ================
# [EN] ==== Depending on your environment, please set your own ================
# [JP] ==== 業務パラメータ設定 ====================================
# [EN] ==== Setting Business Parameters ====================================
# --------------------------------------------------------
# [JP]  URL            : NEXUS WebサービスURLコンテキストパス（末尾スラッシュ必要）
# [JP]  USER           : ベーシック認証ユーザー
# [JP]  PASSWORD       : ベーシック認証パスワード
# [EN]  URL            : NEXUS Web services URL context path (with trailing slash)
# [EN]  USER           : Basic authentication user
# [EN]  PASSWORD       : Basic authentication password
# --------------------------------------------------------
#URL=http://nexus-th-d.gscm.globaldenso.com/NEXUS_EXPORT/
#USER=nexus-th
#PASSWORD=nexus-th
URL=https://nexus-th.gscm.globaldenso.com/NEXUS_EXPORT/
USER=Nexus-th
PASSWORD=R0920L0319-th-User

# [JP] ==== 引数チェック ==================================
# [EN] ==== Parameter check ==================================
if [ $# -lt 1 ];then
   echo "Usage: reruncml.sh <Case mark No.> ..."
   exit
fi

# [JP] ==== クラスパスの設定 ==================================
# [EN] ==== Setting the Classpath ==================================
if [ ! -d ${LIB_DIR} ]; then
    exit 16
fi
CLASSPATH=./
CLASSPATH=${CLASSPATH}:${CONF_DIR}
CLASSPATH=${CLASSPATH}:${CONF_DIR}/library-config
for JAR in `ls -1 ${LIB_DIR}/*.jar`
do
    CLASSPATH=${CLASSPATH}:${JAR}
done

# [JP] ==== 実行クラスの設定 ============================
# [EN] ==== Setting classes starting job ============================
EXECUTE_CLASS=com.globaldenso.eca0027.core.common.util.MigRerunCml

# [JP] ==== Javaアプリケーション実行 ========================================
# [EN] ==== Starting job ========================================
export CLASSPATH
echo ${JAVA_HOME}/bin/java -Dlog4j.configuration=${LOG_XML} \
    ${EXECUTE_CLASS} ${URL} ${USER} ${PASSWORD} $@
${JAVA_HOME}/bin/java -Dlog4j.configuration=${LOG_XML} \
    ${EXECUTE_CLASS} ${URL} ${USER} ${PASSWORD} $@

exit
