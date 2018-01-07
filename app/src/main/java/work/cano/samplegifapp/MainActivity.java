package work.cano.samplegifapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    // Context宣言
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // contextを確保
        context = this;
        // ImageViewにGifを表示
        Glide.with(this).load(R.raw.sample_1).into((ImageView) findViewById(R.id.sample));

        findViewById(R.id.updateButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 更新時
                Glide.with(context).load(R.raw.sample_2).into((ImageView) findViewById(R.id.sample));
            }
        });
    }

}
