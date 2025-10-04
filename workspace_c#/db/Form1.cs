﻿using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace db
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string connectionString = "" +
            "Data Source=" +
            "(" +
            " DESCRIPTION=" +
            " (" +
            " ADDRESS=" +
            " (PROTOCOL=TCP)" +
            " (HOST=125.181.132.133)" +
            " (PORT=51521)" +
            " )" +
            " (" +
            " CONNECT_DATA=" +
            " (" +
            " SERVICE_NAME=xe" +
            " )" +
            " )" +
            ");" +
            "User Id=scott4_19;" +
            "Password=tiger;";

            using (OracleConnection connection = new OracleConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string query = "SELECT * FROM EMP";

                    OracleCommand command = new OracleCommand(query, connection);

                    OracleDataAdapter adapter = new OracleDataAdapter(command);
                    DataTable dataTable = new DataTable();
                    adapter.Fill(dataTable);

                    dataGridView1.DataSource = dataTable;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("오류 발생: " + ex.Message);
                }
            }
        }
    }
}
