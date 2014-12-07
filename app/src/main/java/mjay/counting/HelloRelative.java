package mjay.counting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;


/**
 * Created by Matthew on 07/12/2014.
 */
public class HelloRelative extends Activity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.counting);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        ImageView objects = (ImageView) findViewById(R.id.imageView);


    }

}