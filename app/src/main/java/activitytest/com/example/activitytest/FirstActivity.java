package activitytest.com.example.activitytest;

import android.app.ProgressDialog;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.content.Intent;

public class FirstActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    private EditText editText;

    private ImageView imageView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "你点击了add", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你点击了remove", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.first_layout);
//        Log.d("firstActivity", this.toString());
//        Button button1 = findViewById(R.id.button_1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////              Toast.makeText(FirstActivity.this, "你点击了按钮", Toast.LENGTH_LONG).show();
////              finish();
////                String data = "翁斌斌";
//                Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
////                intent.putExtra("extra_data", data);
////              Intent intent = new Intent("com.example.activitytest.ACTION_START");
////              intent.addCategory("com.example.activitytest.MY_CATEGORY");
////                Intent intent = new Intent(Intent.ACTION_DIAL);
////                intent.setData(Uri.parse("tel:10086"));
////                startActivityForResult(intent, 1);
//                startActivity(intent);
//            }
//        });
          Button button12 = findViewById(R.id.button_12);
          imageView = findViewById(R.id.image_view1);
          editText = findViewById(R.id.edit_text);
          progressBar = findViewById(R.id.progress_bar);
          button12.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  String val = editText.getText().toString();
                  imageView.setImageResource(R.drawable.img_2);
                  Toast.makeText(FirstActivity.this, val, Toast.LENGTH_SHORT).show();
                  int isVisibility = progressBar.getVisibility();
                  Log.d("isVisibility", "onClick: " + isVisibility);
                  progressBar.setVisibility(isVisibility == View.GONE ? View.VISIBLE : View.GONE);
              }
          });

        Button button13 = findViewById(R.id.button_13);

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int progress = progressBar.getProgress();
                Toast.makeText(FirstActivity.this, progress + "%", Toast.LENGTH_SHORT).show();
                progressBar.setProgress(progress + 10);

                ProgressDialog progressDialog = new ProgressDialog(FirstActivity.this);
                progressDialog.setTitle("progressDialog title");
                progressDialog.setMessage("progressDialog message");
                progressDialog.setCancelable(true);
                progressDialog.show();
            }
        });

    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        Log.d("FirstActivity", "onActivityResult-RESULT_OK: " + RESULT_OK);
//        switch (requestCode) {
//            case 1:
//                if (resultCode == RESULT_OK) {
//                    String returnedData = data.getStringExtra("data_result");
//                    Log.d("FirstActivity", "onActivityResult: " + returnedData);
//                }
//        }
//    }
}
