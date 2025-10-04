using CefSharp;
using CefSharp.WinForms;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace webView
{
    public partial class Form1 : Form
    {

        ChromiumWebBrowser _chrome = null;

        public Form1()
        {
            InitializeComponent();
            this.WindowState = FormWindowState.Maximized;   // 전체화면처럼 윈도우창을 최대화해줌
            InitializeCefSharp();
        }

        private void InitializeCefSharp()
        {
            string url = "https://naver.com";


            // CEF: Chrominum Embedded Framework    // 크롬을 포함한 프레임워크

            // 브라우저 세팅
            CefSettings settings = new CefSettings();
            // 쿠키 데이터 사용
            settings.CachePath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData) + @"\CEF";
            // 한국어 설정
            settings.Locale = "ko";
            Cef.Initialize(settings);

            // 웹 사이트 이동
            _chrome = new ChromiumWebBrowser(url);

            // Form에 CefSharp컨트롤 추가
            this.Controls.Add(_chrome);

            // Form 전체 영역에 붙이기
            _chrome.Dock = DockStyle.Fill;
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            // 창 닫을 때 정리해주는 코드

            // base : java의 super
            base.OnFormClosing(e);
            // Cef 리소스 정리
            Cef.Shutdown();
        }
    }
}
