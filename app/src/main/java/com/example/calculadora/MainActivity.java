package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    double currentNumber = 0;
    boolean isStart = true;
    boolean hasComma = false;
    boolean hasOperation = false;
    boolean hasSum = false;
    boolean hasMinus = false;
    boolean hasMultiplication = false;
    boolean hasDivision = false;
    boolean isResult = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void BtnACClick(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        textViewResultat.setText("0");
        textViewOperacio.setText("");
        currentNumber = 0;
        hasSum = false;
        hasMinus = false;
        hasMultiplication = false;
        hasDivision = false;
        hasOperation = false;
        hasComma = false;
        isResult = false;
        isStart = true;
    }

    public void Btn0Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("0");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("0");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "0");
    }

    public void Btn1Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("1");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("1");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "1");
    }

    public void Btn2Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("2");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("2");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "2");
    }

    public void Btn3Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("3");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("3");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "3");
    }

    public void Btn4Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("4");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("4");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "4");
    }

    public void Btn5Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("5");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("5");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "5");
    }

    public void Btn6Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("6");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("6");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "6");
    }

    public void Btn7Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("7");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("7");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "7");
    }

    public void Btn8Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("8");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("8");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "8");
    }

    public void Btn9Click(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (textViewResultat.getText().equals("0") || isResult) {
            textViewResultat.setText("9");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }
        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("9");
            hasOperation = false;
            hasComma = false;
        }
        else textViewResultat.setText(textViewResultat.getText().toString() + "9");
    }

    public void BtnCommaClick(View view) {
        if (hasComma) return;
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        if (isResult) {
            textViewResultat.setText("0.");
            currentNumber = 0;
            isResult = false;
            isStart = true;
        }

        else if (hasOperation) {
            textViewOperacio.setText(textViewResultat.getText().toString());
            textViewResultat.setText("0.");
            hasOperation = false;
        }
        else {
            textViewResultat.setText(textViewResultat.getText().toString() + ".");
        }
        hasComma = true;
    }

    public void BtnPlusClick(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);

        if (isStart) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());
                currentNumber = Number;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
                return;
            }

            textViewResultat.setText(textViewResultat.getText().toString() + " + ");
            hasSum = true;
            hasMinus = false;
            hasMultiplication = false;
            hasDivision = false;
            hasOperation = true;
            hasComma = false;
            isResult = false;
            isStart = false;
            return;
        }

        BtnEqualClick(view);

        textViewResultat.setText(String.format("%.4f", currentNumber) + " + ");
        hasSum = true;
        hasMinus = false;
        hasMultiplication = false;
        hasDivision = false;
        hasOperation = true;
        hasComma = false;
        isResult = false;
    }

    public void BtnMinusClick(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);

        if (isStart) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());
                currentNumber = Number;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
                return;
            }

            textViewResultat.setText(textViewResultat.getText().toString() + " - ");
            hasSum = false;
            hasMinus = true;
            hasMultiplication = false;
            hasDivision = false;
            hasOperation = true;
            hasComma = false;
            isResult = false;
            isStart = false;
            return;
        }

        BtnEqualClick(view);

        textViewResultat.setText(String.format("%.4f", currentNumber) + " - ");
        hasSum = false;
        hasMinus = true;
        hasMultiplication = false;
        hasDivision = false;
        hasOperation = true;
        hasComma = false;
        isResult = false;
    }

    public void BtnMultiplicationClick(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);

        if (isStart) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());
                currentNumber = Number;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
                return;
            }

            textViewResultat.setText(textViewResultat.getText().toString() + " x ");
            hasSum = false;
            hasMinus = false;
            hasMultiplication = true;
            hasDivision = false;
            hasOperation = true;
            hasComma = false;
            isResult = false;
            isStart = false;
            return;
        }

        BtnEqualClick(view);

        textViewResultat.setText(String.format("%.4f", currentNumber) + " x ");
        hasSum = false;
        hasMinus = false;
        hasMultiplication = true;
        hasDivision = false;
        hasOperation = true;
        hasComma = false;
        isResult = false;
    }

    public void BtnDivisionClick(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);

        if (isStart) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());
                currentNumber = Number;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
                return;
            }

            textViewResultat.setText(textViewResultat.getText().toString() + " / ");
            hasSum = false;
            hasMinus = false;
            hasMultiplication = false;
            hasDivision = true;
            hasOperation = true;
            hasComma = false;
            isResult = false;
            isStart = false;
            return;
        }

        BtnEqualClick(view);

        textViewResultat.setText(String.format("%.4f", currentNumber) + " / ");
        hasSum = false;
        hasMinus = false;
        hasMultiplication = false;
        hasDivision = true;
        hasOperation = true;
        hasComma = false;
        isResult = false;
    }

    public void BtnEqualClick(View view) {
        TextView textViewResultat = findViewById(R.id.textViewResultat);
        TextView textViewOperacio = findViewById(R.id.textViewOperacio);

        textViewOperacio.setText("");

        if (hasOperation) {
            textViewResultat.setText(String.format("%.4f", currentNumber));
        }
        else if (hasSum) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());

                if (Number == 0 && (hasDivision)) {
                    Toast.makeText(this, "Error, cannot divide by 0", Toast.LENGTH_SHORT).show();
                    BtnACClick(view);
                    return;
                }

                currentNumber += Number;
                textViewResultat.setText(String.format("%.4f", currentNumber));
                hasComma = false;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
            }
        }
        else if (hasMinus) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());

                if (Number == 0 && (hasDivision)) {
                    Toast.makeText(this, "Error, cannot divide by 0", Toast.LENGTH_SHORT).show();
                    BtnACClick(view);
                    return;
                }

                currentNumber -= Number;
                textViewResultat.setText(String.format("%.4f", currentNumber));
                hasComma = false;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
            }
        }
        else if (hasMultiplication) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());

                if (Number == 0 && (hasDivision)) {
                    Toast.makeText(this, "Error, cannot divide by 0", Toast.LENGTH_SHORT).show();
                    BtnACClick(view);
                    return;
                }

                currentNumber *= Number;
                textViewResultat.setText(String.format("%.4f", currentNumber));
                hasComma = false;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
            }
        }
        else if (hasDivision) {
            try {
                double Number = Double.parseDouble(textViewResultat.getText().toString());

                if (Number == 0 && (hasDivision)) {
                    Toast.makeText(this, "Error, cannot divide by 0", Toast.LENGTH_SHORT).show();
                    BtnACClick(view);
                    return;
                }

                currentNumber /= Number;
                textViewResultat.setText(String.format("%.4f", currentNumber));
                hasComma = false;
            }
            catch (NumberFormatException e) {
                BtnACClick(view);
            }
        }

        hasSum = false;
        hasMinus = false;
        hasMultiplication = false;
        hasDivision = false;
        hasOperation = false;
        isResult = true;
    }
}