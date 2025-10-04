namespace Calculator
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.display = new System.Windows.Forms.Label();
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.btn_plus = new System.Windows.Forms.Button();
            this.btn0 = new System.Windows.Forms.Button();
            this.btn_init = new System.Windows.Forms.Button();
            this.btn3 = new System.Windows.Forms.Button();
            this.btn_multi = new System.Windows.Forms.Button();
            this.btn6 = new System.Windows.Forms.Button();
            this.btn5 = new System.Windows.Forms.Button();
            this.btn4 = new System.Windows.Forms.Button();
            this.btn_div = new System.Windows.Forms.Button();
            this.btn9 = new System.Windows.Forms.Button();
            this.btn8 = new System.Windows.Forms.Button();
            this.btn7 = new System.Windows.Forms.Button();
            this.btn_result = new System.Windows.Forms.Button();
            this.btn_minus = new System.Windows.Forms.Button();
            this.btn2 = new System.Windows.Forms.Button();
            this.btn1 = new System.Windows.Forms.Button();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // display
            // 
            this.display.Dock = System.Windows.Forms.DockStyle.Top;
            this.display.Font = new System.Drawing.Font("굴림", 48F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.display.Location = new System.Drawing.Point(0, 0);
            this.display.Name = "display";
            this.display.Size = new System.Drawing.Size(363, 96);
            this.display.TabIndex = 0;
            this.display.Text = "0";
            this.display.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.ColumnCount = 4;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Controls.Add(this.btn_plus, 3, 3);
            this.tableLayoutPanel1.Controls.Add(this.btn0, 1, 3);
            this.tableLayoutPanel1.Controls.Add(this.btn_init, 0, 3);
            this.tableLayoutPanel1.Controls.Add(this.btn3, 2, 2);
            this.tableLayoutPanel1.Controls.Add(this.btn_multi, 3, 1);
            this.tableLayoutPanel1.Controls.Add(this.btn6, 2, 1);
            this.tableLayoutPanel1.Controls.Add(this.btn5, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.btn4, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.btn_div, 3, 0);
            this.tableLayoutPanel1.Controls.Add(this.btn9, 2, 0);
            this.tableLayoutPanel1.Controls.Add(this.btn8, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.btn7, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.btn_result, 2, 3);
            this.tableLayoutPanel1.Controls.Add(this.btn_minus, 3, 2);
            this.tableLayoutPanel1.Controls.Add(this.btn2, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.btn1, 0, 2);
            this.tableLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.tableLayoutPanel1.Location = new System.Drawing.Point(0, 96);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 4;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(363, 425);
            this.tableLayoutPanel1.TabIndex = 1;
            // 
            // btn_plus
            // 
            this.btn_plus.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_plus.Location = new System.Drawing.Point(273, 321);
            this.btn_plus.Name = "btn_plus";
            this.btn_plus.Size = new System.Drawing.Size(87, 100);
            this.btn_plus.TabIndex = 15;
            this.btn_plus.Text = "+";
            this.btn_plus.UseVisualStyleBackColor = true;
            this.btn_plus.Click += new System.EventHandler(this.btn_plus_Click);
            // 
            // btn0
            // 
            this.btn0.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn0.Location = new System.Drawing.Point(93, 321);
            this.btn0.Name = "btn0";
            this.btn0.Size = new System.Drawing.Size(84, 100);
            this.btn0.TabIndex = 13;
            this.btn0.Text = "0";
            this.btn0.UseVisualStyleBackColor = true;
            this.btn0.Click += new System.EventHandler(this.btn0_Click);
            // 
            // btn_init
            // 
            this.btn_init.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_init.Location = new System.Drawing.Point(3, 321);
            this.btn_init.Name = "btn_init";
            this.btn_init.Size = new System.Drawing.Size(84, 100);
            this.btn_init.TabIndex = 12;
            this.btn_init.Text = "C";
            this.btn_init.UseVisualStyleBackColor = true;
            this.btn_init.Click += new System.EventHandler(this.btn_init_Click);
            // 
            // btn3
            // 
            this.btn3.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn3.Location = new System.Drawing.Point(183, 215);
            this.btn3.Name = "btn3";
            this.btn3.Size = new System.Drawing.Size(84, 100);
            this.btn3.TabIndex = 10;
            this.btn3.Text = "3";
            this.btn3.UseVisualStyleBackColor = true;
            this.btn3.Click += new System.EventHandler(this.btn3_Click);
            // 
            // btn_multi
            // 
            this.btn_multi.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_multi.Location = new System.Drawing.Point(273, 109);
            this.btn_multi.Name = "btn_multi";
            this.btn_multi.Size = new System.Drawing.Size(87, 100);
            this.btn_multi.TabIndex = 7;
            this.btn_multi.Text = "*";
            this.btn_multi.UseVisualStyleBackColor = true;
            this.btn_multi.Click += new System.EventHandler(this.btn_multi_Click);
            // 
            // btn6
            // 
            this.btn6.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn6.Location = new System.Drawing.Point(183, 109);
            this.btn6.Name = "btn6";
            this.btn6.Size = new System.Drawing.Size(84, 100);
            this.btn6.TabIndex = 6;
            this.btn6.Text = "6";
            this.btn6.UseVisualStyleBackColor = true;
            this.btn6.Click += new System.EventHandler(this.btn6_Click);
            // 
            // btn5
            // 
            this.btn5.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn5.Location = new System.Drawing.Point(93, 109);
            this.btn5.Name = "btn5";
            this.btn5.Size = new System.Drawing.Size(84, 100);
            this.btn5.TabIndex = 5;
            this.btn5.Text = "5";
            this.btn5.UseVisualStyleBackColor = true;
            this.btn5.Click += new System.EventHandler(this.btn5_Click);
            // 
            // btn4
            // 
            this.btn4.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn4.Location = new System.Drawing.Point(3, 109);
            this.btn4.Name = "btn4";
            this.btn4.Size = new System.Drawing.Size(84, 100);
            this.btn4.TabIndex = 4;
            this.btn4.Text = "4";
            this.btn4.UseVisualStyleBackColor = true;
            this.btn4.Click += new System.EventHandler(this.btn4_Click);
            // 
            // btn_div
            // 
            this.btn_div.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_div.Location = new System.Drawing.Point(273, 3);
            this.btn_div.Name = "btn_div";
            this.btn_div.Size = new System.Drawing.Size(87, 100);
            this.btn_div.TabIndex = 3;
            this.btn_div.Text = "/";
            this.btn_div.UseVisualStyleBackColor = true;
            this.btn_div.Click += new System.EventHandler(this.btn_div_Click);
            // 
            // btn9
            // 
            this.btn9.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn9.Location = new System.Drawing.Point(183, 3);
            this.btn9.Name = "btn9";
            this.btn9.Size = new System.Drawing.Size(84, 100);
            this.btn9.TabIndex = 2;
            this.btn9.Text = "9";
            this.btn9.UseVisualStyleBackColor = true;
            this.btn9.Click += new System.EventHandler(this.btn9_Click);
            // 
            // btn8
            // 
            this.btn8.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn8.Location = new System.Drawing.Point(93, 3);
            this.btn8.Name = "btn8";
            this.btn8.Size = new System.Drawing.Size(84, 100);
            this.btn8.TabIndex = 1;
            this.btn8.Text = "8";
            this.btn8.UseVisualStyleBackColor = true;
            this.btn8.Click += new System.EventHandler(this.btn8_Click);
            // 
            // btn7
            // 
            this.btn7.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn7.Location = new System.Drawing.Point(3, 3);
            this.btn7.Name = "btn7";
            this.btn7.Size = new System.Drawing.Size(84, 100);
            this.btn7.TabIndex = 0;
            this.btn7.Text = "7";
            this.btn7.UseVisualStyleBackColor = true;
            this.btn7.Click += new System.EventHandler(this.btn7_Click);
            // 
            // btn_result
            // 
            this.btn_result.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_result.Location = new System.Drawing.Point(183, 321);
            this.btn_result.Name = "btn_result";
            this.btn_result.Size = new System.Drawing.Size(84, 100);
            this.btn_result.TabIndex = 14;
            this.btn_result.Text = "=";
            this.btn_result.UseVisualStyleBackColor = true;
            this.btn_result.Click += new System.EventHandler(this.btn_result_Click);
            // 
            // btn_minus
            // 
            this.btn_minus.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn_minus.Location = new System.Drawing.Point(273, 215);
            this.btn_minus.Name = "btn_minus";
            this.btn_minus.Size = new System.Drawing.Size(87, 100);
            this.btn_minus.TabIndex = 11;
            this.btn_minus.Text = "-";
            this.btn_minus.UseVisualStyleBackColor = true;
            this.btn_minus.Click += new System.EventHandler(this.btn_minus_Click);
            // 
            // btn2
            // 
            this.btn2.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn2.Location = new System.Drawing.Point(93, 215);
            this.btn2.Name = "btn2";
            this.btn2.Size = new System.Drawing.Size(84, 100);
            this.btn2.TabIndex = 9;
            this.btn2.Text = "2";
            this.btn2.UseVisualStyleBackColor = true;
            this.btn2.Click += new System.EventHandler(this.btn2_Click);
            // 
            // btn1
            // 
            this.btn1.Font = new System.Drawing.Font("굴림", 36F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.btn1.Location = new System.Drawing.Point(3, 215);
            this.btn1.Name = "btn1";
            this.btn1.Size = new System.Drawing.Size(84, 100);
            this.btn1.TabIndex = 8;
            this.btn1.Text = "1";
            this.btn1.UseVisualStyleBackColor = true;
            this.btn1.Click += new System.EventHandler(this.btn1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(363, 521);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Controls.Add(this.display);
            this.Name = "Form1";
            this.Text = "Form1";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label display;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.Button btn7;
        private System.Windows.Forms.Button btn0;
        private System.Windows.Forms.Button btn_init;
        private System.Windows.Forms.Button btn_minus;
        private System.Windows.Forms.Button btn3;
        private System.Windows.Forms.Button btn2;
        private System.Windows.Forms.Button btn1;
        private System.Windows.Forms.Button btn_multi;
        private System.Windows.Forms.Button btn6;
        private System.Windows.Forms.Button btn5;
        private System.Windows.Forms.Button btn4;
        private System.Windows.Forms.Button btn_div;
        private System.Windows.Forms.Button btn9;
        private System.Windows.Forms.Button btn8;
        private System.Windows.Forms.Button btn_result;
        private System.Windows.Forms.Button btn_plus;
    }
}

