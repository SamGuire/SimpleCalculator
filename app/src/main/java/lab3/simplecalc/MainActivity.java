package lab3.simplecalc;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private double firstNum = 0;
    private double secondNum = 0;
    private enum OP {none,add,multiply,substract,divide}
    private OP operator = OP.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findBtnClick(View view){
        int id = view.getId();
        EditText curText = (EditText) findViewById(R.id.equationText);
        switch (id) {
            case R.id.btn0:
                curText.setText(curText.getText()+"0");
                break;
            case R.id.btn1:
                curText.setText(curText.getText()+"1");
                break;
            case R.id.btn2:
                curText.setText(curText.getText()+"2");
                break;
            case R.id.btn3:
                curText.setText(curText.getText()+"3");
                break;
            case R.id.btn4:
                curText.setText(curText.getText()+"4");
                break;
            case R.id.btn5:
                curText.setText(curText.getText()+"5");
                break;
            case R.id.btn6:
                curText.setText(curText.getText()+"6");
                break;
            case R.id.btn7:
                curText.setText(curText.getText()+"7");
                break;
            case R.id.btn8:
                curText.setText(curText.getText()+"8");
                break;
            case R.id.btn9:
                curText.setText(curText.getText()+"9");
                break;
            case R.id.btnPlus:
                add();
                break;
            case R.id.btnMinus:
                substact();
                break;
            case R.id.btnDivide:
                divide();
                break;
            case R.id.btnMultiply:
                multiply();
                break;
            case R.id.btnClear:
                clear();
                break;
            case R.id.btnDot:
                curText.setText(curText.getText()+".");
                break;
            case R.id.btnEquals:
                evaluate();
                break;
            default:
                curText.setText("Error");
                break;



        }
    }

    public void add(){

            this.operator = OP.add;
            EditText curText = (EditText) findViewById(R.id.equationText);
            this.firstNum = Double.parseDouble(curText.getText().toString());
            curText.setText("");

    }
    public void substact(){
            this.operator = OP.substract;
            EditText curText = (EditText) findViewById(R.id.equationText);
            this.firstNum = Double.parseDouble(curText.getText().toString());
            curText.setText("");

    }
    public void multiply(){

            this.operator = OP.multiply;
            EditText curText = (EditText) findViewById(R.id.equationText);
            this.firstNum = Double.parseDouble(curText.getText().toString());
            curText.setText("");

    }
    public void divide(){

            this.operator = OP.divide;
            EditText curText = (EditText) findViewById(R.id.equationText);
            this.firstNum = Double.parseDouble(curText.getText().toString());
            curText.setText("");

    }
    public void clear(){
        this.operator = OP.none;
        this.firstNum = 0;
        this.secondNum = 0;
        EditText curText = (EditText) findViewById(R.id.equationText);
        curText.setText("");
    }
    public void evaluate(){
        if (this.operator != OP.none){
            EditText curText = (EditText) findViewById(R.id.equationText);
            this.secondNum = Double.parseDouble(curText.getText().toString());
            double result = 0;
            if (this.operator == OP.add){
                result = this.firstNum + this.secondNum;
            }
            else if (this.operator == OP.substract){
                result = this.firstNum - this.secondNum;
            }
            else if (this.operator == OP.multiply){
                result = this.firstNum * this.secondNum;
            }
            else if (this.operator == OP.divide){
                result = this.firstNum / this.secondNum;
            }
            this.operator = OP.none;
            this.firstNum = result;
            curText.setText(String.valueOf(result));
        }
    }


}
