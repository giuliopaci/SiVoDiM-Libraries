package starklabs.sivodim;

import android.content.Context;
import android.widget.ArrayAdapter;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.StringReader;
import java.util.Vector;

import static org.junit.Assert.*;

import starklabs.sivodim.Drama.Model.Screenplay.Screenplay;
import starklabs.sivodim.Drama.Model.Screenplay.ScreenplayImpl;
import starklabs.sivodim.Drama.Presenter.ScreenplayPresenter;
import starklabs.sivodim.Drama.Presenter.ScreenplayPresenterImpl;
import static org.mockito.Mockito.when;
/**
 * Created by Enrico on 21/06/16.
 */
/**
 * test TU5 that test the correct exportation of a ScreenPlay
 */
public class TU5 {
    @Test
            public void testExport(){
        File test = Mockito.mock(File.class);
        ScreenplayImpl s=new ScreenplayImpl("titolo");
    }



}
