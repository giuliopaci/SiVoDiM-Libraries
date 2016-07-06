package starklabs.libraries;

import android.content.Context;

import org.junit.Test;

import starklabs.libraries.Model.EngineManager.Engine;
import starklabs.libraries.Model.EngineManager.EngineImpl;
import starklabs.libraries.Model.Mivoq.MivoqTTSSingleton;
import starklabs.libraries.Model.Voice.Language;
import starklabs.libraries.Model.Voice.MivoqVoice;
import org.mockito.Mockito;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Enrico on 24/06/16.
 */
public class TU13 {
    @Test
    public void testSynthesizeToFile() {
        String name = "name";
        String myVoiceName = "myVoiceName";
        Language language = new Language("lingua");

        MivoqVoice mivoqVoice = new MivoqVoice(name, myVoiceName, language);
        String path = "/Users/Enrico/Desktop/test/test.wav";
        String text = "prova";

        MivoqTTSSingleton mivoqTTSSingleton = MivoqTTSSingleton.getInstance();

        Context context = Mockito.mock(Context.class);

        mivoqTTSSingleton.setContext(context);

        try {
            mivoqTTSSingleton.synthesizeToFile(path,mivoqVoice,text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
/*
        File file=new File(path);
        assertEquals(true,file.exists());
*/
    }
}