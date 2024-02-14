@echo off
REM ****************************************************************************
REM ** [JP]  ファイル名 : aijbMainControllerStop.bat                               **
REM ** [JP]  処理概要   : AijbMainController(AMC)の停止                            **
REM ** [EN]  File name              : aijbMainControllerStop.bat                   **
REM ** [EN]  Outline of processing  : Stop AijbMainController (AMC)                **
REM ** ---------------------------------------------------------------------- **
REM ** [JP]  変更履歴   : 2010/02/13 新規作成(KN-0816)                             **
REM ** [JP]             : 2012/12/04 プロセス名短縮対応(チケット136)               **
REM **                                                                        **
REM ** [EN]  Change history : 2010/02/13 Create new(KN-0816)                               **
REM ** [EN]                 : 2012/12/04 Process name corresponding reduction (Ticket 136) **
REM **                                                                        **
REM **  $ aijbMainControllerStop.bat 4391 2013-05-22 07:00:46Z hiroko_nagata@dnitsol.com $
REM **                                                                        **
REM ****************************************************************************
setlocal enabledelayedexpansion

REM [JP] ==== 環境に応じて各自で設定してください ================
REM [EN] ==== Depending on your environment, please set your own ================
REM [JP] ==== パラメータ設定 ====================================
REM [EN] ==== Setting Parameters ====================================
REM --------------------------------------------------------
REM [JP]  JAVA_XMX       ： AMCの最大ヒープサイズ(MB)
REM [JP]  JAVA_XMS       ： AMCの初期ヒープサイズ(MB)
REM [EN]  JAVA_XMX       ： Maximum heap size of AMC (MB)
REM [EN]  JAVA_XMS       ： Initial heap size of AMC (MB)
REM --------------------------------------------------------
set JAVA_XMX=32
set JAVA_XMS=32

REM [JP] ==== 起動クラスの設定 ==================================
REM [EN] ==== Setting the startup class ==================================
set EXECUTE_CLASS=com.globaldenso.ai.aijb.core.QueueExecuteProcMain

REM [JP] ==== log4jの設定 =======================================
REM [EN] ==== Setting the log4j =======================================
set LOG_XML=log4jTrs.xml

REM [JP] ==== 共通環境変数の設定 ================================
REM [EN] ==== Setting common environment variables ================================
call %~dp0\setenv.bat
if %errorlevel% == 0 (
    goto NREND
)

REM [JP] ==== 共通環境変数設定失敗 ログ出力 =====================
REM [EN] ==== Failure of common environment variables  Log output =====================
echo [boot] [%DATE% %TIME%] [ERROR] setenv.bat Execute Failed >> %~dp0\aijbMainControllerStop.log

:NREND
REM [JP] ==== ログ出力先設定 ====================================
REM [EN] ==== Log output destination setting ====================================
set LOGFILE=%AIJB_DIR%\logs\aijbMainControllerStop.log

REM [JP] ==== 処理開始ログ出力 ==================================
REM [EN] ==== Log output process starts ==================================
echo %DATE% %TIME% INFO :START AijbMainController StopBatch >> %LOGFILE%

REM [JP] ==== 処理実行 ==========================================
REM [EN] ==== Process execution ==========================================
echo %DATE% %TIME% INFO :Start stop command >> %LOGFILE%
set CLASSPATH=%CLASSPATH%
javaw -Xrs -Xmx%JAVA_XMX%m -Xms%JAVA_XMS%m -Dlog4j.configuration=%LOG_XML% %EXECUTE_CLASS% stop >> %LOGFILE% 2>&1
echo %DATE% %TIME% INFO :End stop command >> %LOGFILE%

REM [JP] ==== 処理終了ログ出力 ==================================
REM [EN] ==== End of processing logging output ==================================
echo %DATE% %TIME% INFO :END AijbMainController StopBatch >> %LOGFILE%
echo -------------------------------------------------------------------------------- >> %LOGFILE%
exit
