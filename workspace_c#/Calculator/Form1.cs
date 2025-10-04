using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
        }

        int firstNum = 0;
        string op = null;
        bool isNext = false;    

        private void btn_div_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "/";
            isNext = true;
        }

        private void btn_multi_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "*";
            isNext = true;
        }

        private void btn_minus_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "-";
            isNext = true;
        }
        private void btn_plus_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "+";
            isNext = true;
        }

        private void btn_result_Click(object sender, EventArgs e)
        {
            isNext = true;

            int result = 0;
            if (op == "+") 
            { 
                result = firstNum + Int32.Parse(display.Text);  
            }
            else if(op == "-")
            {
                result = firstNum - Int32.Parse(display.Text);
            }
            else if (op == "*")
            {
                result = firstNum * Int32.Parse(display.Text);
            }
            else if (op == "/")
            {
                if (Int32.Parse(display.Text) == 0)
                {
                    display.Text = "0";
                    return;
                }
                result = firstNum / Int32.Parse(display.Text);
            }

            display.Text = "" + result;
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            if(isNext)
            {
                display.Text = "";
                isNext = false;
            }
           
                string str = display.Text += "0";
                int i = Int32.Parse(str);
                display.Text = "" + i;
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "1";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "2";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "3";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }
        private void btn4_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "4";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "5";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "6";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "7";
            int i = Int32.Parse(str);
            display.Text = "" + i;

        }

        private void btn8_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "8";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "9";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn_init_Click(object sender, EventArgs e)
        {
            display.Text = "0";
            op = null;
            isNext = false;
        }
    }
}
