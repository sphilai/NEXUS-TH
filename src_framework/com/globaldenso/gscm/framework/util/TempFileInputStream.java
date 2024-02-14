/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * TempFileInputStreamクラス
 * TempFileInputStream class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一時ファイル用InputStreamクラス
 * InputStream class for temporary file
 * <p>
 * 
 * <pre>
 * FileInputStreamクラスを継承した一時ファイル用のInputStreamクラスです。
 * InputStream class for temporary file inherited from class FileInputStream
 * </pre>
 * 
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TempFileInputStream extends FileInputStream {
    /** 一時ファイルのインスタンス */
    /** Instance for temporary file */
    private File tmpFile = null;

    /**
     * コンストラクタ 引数のファイルはcloseしたときに削除される
     * Constractor The parameter file will be delete when the file will close
     * 
     * @param tmpFile 読み込みファイル
     * @param tmpFile Input file
     * @throws FileNotFoundException 例外
     * @throws FileNotFoundException Exception
     */
    public TempFileInputStream(File tmpFile) throws FileNotFoundException {
        super(tmpFile);
        this.tmpFile = tmpFile;
    }

    /**
     * Closeして一時ファイル削除
     * Close the temporary file and delete
     * 
     * @throws IOException 例外
     * @throws IOException Exception
     */
    @Override
    public void close() throws IOException {
        super.close();
        tmpFile.delete();
    }

}
