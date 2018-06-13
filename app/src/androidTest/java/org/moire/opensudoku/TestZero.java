package org.moire.opensudoku;


import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.moire.opensudoku.gui.exporting.FileExportTask;
import org.moire.opensudoku.utilityTest.GeneralEvent;
import org.moire.opensudoku.utilityTest.SpecificUIEvent;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class TestZero {

    @BeforeClass
    public static void startup() {
        GeneralEvent.setTime(GeneralEvent.NORMAL);
    }

    @Test
    public void ZeroTest() throws InterruptedException {
        GeneralEvent.declareandSetSemaphore(FileExportTask.sem);
        GeneralEvent.start(FileExportTask.sem);
        GeneralEvent.finish(FileExportTask.sem);


        GeneralEvent.startApp("org.moire.opensudoku");
        GeneralEvent.pause19();
        GeneralEvent.resume19();
        GeneralEvent.doubleRotation();
        SpecificUIEvent.execute(SpecificUIEvent.SORT);
    }


    @After
    public void tearDown() {
        Log.d("TEST", "End test");
    }


}
