package myapp.com.app203;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.kim);
        button=findViewById(R.id.btnckh);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num= random.ints(1, 9).findFirst().getAsInt();
                int i = imageView.getMeasuredHeight();
                int goc=0;
                if(num==1)
                {
                    goc=50;
                }
                else if(num==2)
                {
                    goc=90;
                }
                else if(num==3)
                {
                    goc=130;
                }
                else if(num==4)
                {
                    goc=180;
                }
                else if(num==5)
                {
                    goc=240;
                }
                else if(num==6)
                {
                    goc=270;
                }
                else if(num==7)
                {
                    goc=310;
                }
                else
                    goc=360;

                ObjectAnimator animation = ObjectAnimator.ofFloat(imageView, "rotation", 0, goc);
                animation.setDuration(500);
                imageView.setPivotX(i/2);
                imageView.setPivotY(i / 2);
                animation.setInterpolator(new LinearInterpolator());
                animation.start();
            }
        });
    }
}