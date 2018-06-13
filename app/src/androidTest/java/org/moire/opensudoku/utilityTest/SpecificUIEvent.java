package org.moire.opensudoku.utilityTest;

public class SpecificUIEvent extends GeneralEvent {

    public static final int SORT = 0;

    public static void execute(int ev) {
        switch (ev) {
            case SORT:
                try {
                    Thread.sleep(TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
/*
                try {
                    (mDevice.findObject(new UiSelector().resourceId("mimecast.com.recruitment:id/sortButton"))).click();
                } catch (UiObjectNotFoundException e) {
                    e.printStackTrace();
                }
                Log.d("TEST", "TEST: Click Sort");
*/
                break;

        }
    }
}
