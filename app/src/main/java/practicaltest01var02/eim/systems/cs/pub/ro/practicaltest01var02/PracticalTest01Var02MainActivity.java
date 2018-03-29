package practicaltest01var02.eim.systems.cs.pub.ro.practicaltest01var02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static practicaltest01var02.eim.systems.cs.pub.ro.practicaltest01var02.R.id.left_button;
import static practicaltest01var02.eim.systems.cs.pub.ro.practicaltest01var02.R.id.left_edit_text;
import static practicaltest01var02.eim.systems.cs.pub.ro.practicaltest01var02.R.id.right_button;

public class PracticalTest01Var02MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;

    double num1,num2,sum;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            num1 = Double.parseDouble(firstNumber.getText().toString());
            num2 = Double.parseDouble(secondNumber.getText().toString());
            sum = num1 + num2;
            addResult.setText(Double.toString(sum));
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);
        firstNumber = (EditText)findViewById(R.id.left_edit_text);
        secondNumber = (EditText)findViewById(R.id.right_edit_text);
        addResult = (TextView)findViewById(R.id.left_nonedit_text);
        btnAdd = (Button)findViewById(R.id.left_button);


    }
}
