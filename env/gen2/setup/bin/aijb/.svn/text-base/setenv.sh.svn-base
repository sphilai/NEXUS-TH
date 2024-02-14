#!/bin/bash
# ****************************************************************************
# ** [JP]  ファイル名 : setenv.sh                                                **
# ** [JP]  処理概要   : 環境変数設定バッチ                                       **
# ** [JP]                                                                       **
# ** [JP]    AI-JBで使用するバッチが共通で必要とする環境変数を設定します。       **
# ** [JP]    指定したフォルダにあるjarファイルを全てクラスパスに追加します。     **
# ** [JP]                                                                       **
# ** [JP]                                                                       **
# ** [JP]   【引数】                                                             **
# ** [JP]      なし。                                                            **
# ** [JP]                                                                       **
# ** [JP]   【環境】                                                             **
# ** [JP]      以下のパスにjarファイルがあることを前提としています。             **
# ** [JP]          [AI-JBインストールディレクトリ]/module/lib                    **
# **                                                                        **
# ** [EN]  File name             : setenv.sh                                         **
# ** [EN]  Outline of processing : Batch setting environment variables               **
# ** [EN]                                                                           **
# ** [EN]    I set the environment variables batch used in the AI-JB need in common. **
# ** [EN]    I added to the classpath all jar files in the folder that you specify.  **
# ** [EN]                                                                           **
# ** [EN]                                                                           **
# ** [EN]   【Argument】                                                                      **
# ** [EN]      None.                                                                 **
# ** [EN]                                                                           **
# ** [EN]   【Environment】                                                                   **
# ** [EN]      It is assumed that there is a jar file in the following path.         **
# ** [EN]          [AI-JB installation directory]/module/lib                         **
# **                                                                        **
# ** ---------------------------------------------------------------------- **
# ** [JP]  変更履歴   : 2012/01/23 新規作成                                      **
# ** [JP]             : 2012/12/06 ログファイル作成用の変数の不具合対応          **
# **                                                                        **
# ** [EN]  Change history : 2012/01/23 Create new                                           **
# ** [EN]                 : 2012/12/06 Defect corresponding variables for log file creation **
# **                                                                        **
# **  $ setenv.sh 4409 2013-05-23 01:46:18Z hiroko_nagata@dnitsol.com $
# **                                                                        **
# ****************************************************************************

# [JP] ==== 環境に応じて各自で設定してください ================
# [EN] ==== Depending on your environment, please set your own ================
# [JP] ==== パラメータ設定 ====================================
# [EN] ==== Setting Parameters ====================================
# --------------------------------------------------------
# [JP]  JAVA_HOME      ： JDKをインストールしたディレクトリ
# [JP]  AIJB_DIR       ： AI-JBをインストールしたディレクトリ
# [JP]  LIB_DIR        ： AI-JBで使用するjarを配置したディレクトリ
# [JP]  BATCH_LOG_DIR  ： AI-JBで使用するログ出力先ディレクトリ
# [EN]  JAVA_HOME      ： Directory where you installed the JDK
# [EN]  AIJB_DIR       ： Directory in which you installed the AI-JB
# [EN]  LIB_DIR        ： Directory where you placed the jar for use with AI-JB
# [EN]  BATCH_LOG_DIR  ： Destination directory of logging to be used by AI-JB
# --------------------------------------------------------
JAVA_HOME=/opt/jdk/jdk1.8.0_20
AIJB_DIR=/data/AIJB
LIB_DIR=${AIJB_DIR}/module/lib
BATCH_LOG_DIR=${AIJB_DIR}/logs/app_log

# [JP] ==== クラスパスの設定 ==================================
# [EN] ==== Setting the Classpath ==================================
# [JP] ==== LIB_DIRフォルダが存在しなかった場合 ===============
# [EN] ==== If the folder does not exist LIB_DIR ===============
if [ ! -d ${LIB_DIR} ]; then
    exit 16
fi

CLASSPATH=${AIJB_DIR}/module/config
CLASSPATH=${CLASSPATH}:${AIJB_DIR}/module/config/library-config
for JAR in `ls -1 ${LIB_DIR}/*.jar`
do
    CLASSPATH=${CLASSPATH}:${JAR}
done

# [JP] ==== ログファイル作成用の変数の設定 ====================
# [EN] ==== Setting Variables for log file creation ====================
seq=`date "+%Y%m%d%H%M%S"``date +%N | cut -c 1-2`
