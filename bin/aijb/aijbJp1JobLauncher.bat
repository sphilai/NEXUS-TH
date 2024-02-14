@echo off
REM ****************************************************************************
REM ** [JP]  ファイル名 : aijbJobJp1Launcher.bat
REM ** [JP]  処理概要   : スケジュール/リクエストジョブを起動する共通のバッチです。
REM ** [JP]
REM ** [JP]    JP1から起動する全てのスケジュール/リクエストジョブは
REM ** [JP]    このバッチから起動させます。
REM ** [JP]
REM ** [JP]   【引数】
REM ** [JP]      1 : ジョブで使用する Spring 設定ファイル(フルパス)
REM ** [JP]
REM ** [JP]      2 : 実行するジョブID
REM **
REM ** [EN]  File name               : aijbJobJp1Launcher.bat
REM ** [EN]  Outline of processing   : It is common to start the batch schedule job / request job.
REM ** [EN]
REM ** [EN]    All schedule jobs / request jobs from JP1 start, launch from this batch.
REM ** [EN]
REM ** [EN]   【Argument】
REM ** [EN]      1 : Spring configuration file for the job (Full path)
REM ** [EN]
REM ** [EN]      2 : Job ID to execute
REM **
REM ** ----------------------------------------------------------------------
REM ** [JP]  変更履歴   : 2011/09/18 新規作成(AIJB-0122)
REM ** [JP]             : 2011/10/12 ログの出力先を修正(KN-0183)
REM ** [JP]             : 2011/10/17 ログの出力先フォルダ確認/作成ロジック追加(KN-0210)
REM ** [JP]             : 2012/12/04 プロセス名短縮対応(チケット136)
REM ** [JP]             : 2013/01/31 ジョブ起動時のOutOfMemoryエラー対応(チケット188)
REM **
REM ** [EN]  Change history : 2011/09/18 Create new(AIJB-0122)
REM ** [EN]                 : 2011/10/12 Modify log output destination(KN-0183)
REM ** [EN]                 : 2011/10/17 Add logic to check / create the log output destination folder (KN-0210)
REM ** [EN]                 : 2012/12/04 Process name corresponding reduction (Ticket 136)
REM ** [EN]                 : 2013/01/31 Corresponding OutOfMemory Error When Starting Job (Ticket 188)
REM **
REM **  $ aijbJp1JobLauncher.bat 4409 2013-05-23 01:46:18Z hiroko_nagata@dnitsol.com $
REM **
REM ****************************************************************************
setlocal enabledelayedexpansion

REM [JP] ==== 環境に応じて各自で設定してください ================
REM [EN] ==== Depending on your environment, please set your own ================
REM [JP] ==== パラメータ設定 ====================================
REM [EN] ==== Setting Parameters ====================================
REM --------------------------------------------------------
REM [JP]  JAVA_XMX      ： ジョブの最大ヒープサイズ(MB)
REM [JP]  JAVA_XMS      ： ジョブの初期ヒープサイズ(MB)
REM [JP]  JAVA_PERMSIZE ： ジョブのPermanent領域サイズ(MB)
REM [JP]  EXECUTE_CLASS ： ジョブを起動するクラス
REM [JP]  LOG_XML       ： ログ出力設定ファイル
REM [EN]  JAVA_XMX      ： Maximum heap size of the job (MB)
REM [EN]  JAVA_XMS      ： Initial heap size of the job (MB)
REM [EN]  JAVA_PERMSIZE ： Permanent region size of the job (MB)
REM [EN]  EXECUTE_CLASS ： Class to start the job
REM [EN]  LOG_XML       ： Logging configuration file
REM --------------------------------------------------------
set JAVA_XMX=192
set JAVA_XMS=192
set JAVA_PERMSIZE=40

REM [JP] ==== ジョブ起動クラスの設定 ============================
REM [EN] ==== Setting classes starting job ============================
set EXECUTE_CLASS=com.globaldenso.ai.aijb.core.job.control.JobJp1Launcher

REM [JP] ==== log4jの設定 =======================================
REM [EN] ==== Setting the log4j =======================================
set LOG_XML=log4jJob.xml

REM [JP] ==== 共通環境変数の設定 ================================
REM [EN] ==== Setting common environment variables ================================
call %~dp0\setenv.bat
if %errorlevel% == 0 (
    goto NREND
)

REM [JP] ==== 共通環境変数設定失敗 ログ出力 =====================
REM [EN] ==== Failure of common environment variables  Log output =====================
echo [boot] [%DATE% %TIME%] [ERROR] setenv.bat Execute Failed >> %~dp0\%2.log

:NREND
REM [JP] ==== ログ出力先フォルダ確認/作成 =======================
REM [EN] ==== Create / Confirmation log output destination folder =======================
if not exist %BATCH_LOG_DIR%\%2 (
    mkdir %BATCH_LOG_DIR%\%2
)

REM [JP] ==== ジョブ起動 ========================================
REM [EN] ==== Starting job ========================================
set CLASSPATH=%CLASSPATH%
javaw -Xrs -Xmx%JAVA_XMX%m -Xms%JAVA_XMS%m -XX:PermSize=%JAVA_PERMSIZE%m -Dlog4j.configuration=%LOG_XML% %EXECUTE_CLASS% %1 %2 >> %BATCH_LOG_DIR%\%2\%seq%.log
exit /b %errorlevel%
