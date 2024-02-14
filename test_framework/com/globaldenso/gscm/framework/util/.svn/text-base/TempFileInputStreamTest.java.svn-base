/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * TempFileInputStreamTestクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TempFileInputStreamTestクラスをテスト
 * <p>
 * 
 * <pre>
 * TempFileInputStreamTestクラスをテスト
 * </pre>
 * 
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TempFileInputStreamTest {

    /**
     * デフォルトコンストラクタ。
     */
    public TempFileInputStreamTest() {
    }

    /**
     * Closeメソッドテスト
     * 
     * @throws IOException 例外
     */
    @Test
    public void testClose() throws IOException {
        File tmpFile = File.createTempFile("test", null);
        TempFileInputStream target = new TempFileInputStream(tmpFile);

        target.close();

        // close確認
        IOException closed = null;
        try {
            target.read();
            fail("close 1");
        } catch (IOException e) {
            closed = e;
        }
        assertNotNull("close 2", closed);

        // 削除済み
        assertFalse("close 3", tmpFile.exists());
    }
}