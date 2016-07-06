package starklabs.libraries;

import android.content.Context;

import org.junit.Test;
import org.mockito.Mockito;

import starklabs.libraries.Model.Mivoq.MivoqTTSSingleton;
import starklabs.libraries.Model.Voice.Effect;
import starklabs.libraries.Model.Voice.EffectImpl;
import starklabs.libraries.Model.Voice.MivoqVoice;
import static org.junit.Assert.assertEquals;


/**
 * Created by Enrico on 24/06/16.
 */
public class TU19 {
    @Test
    public void testEditLanguage(){
        MivoqTTSSingleton mivoqTTSSingleton = MivoqTTSSingleton.getInstance();
        Context context = Mockito.mock(Context.class);
        mivoqTTSSingleton.setContext(context);

        String name = "name";
        String gender = "male";
        String myLanguage = "de";

        //Create real voice
        MivoqVoice enri = mivoqTTSSingleton.createVoice(name, gender, myLanguage);
        enri.setGenderLanguage(gender,myLanguage);
        assertEquals(true,enri.getLanguage().equals(myLanguage));

    }
}