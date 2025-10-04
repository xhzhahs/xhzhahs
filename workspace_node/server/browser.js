// require('playwright').chromium 을 아래처럼 사용가능
const {chromium} = require('playwright')

test()

async function test(){
    const browser = await chromium.launch({
        headless: false 
    })

    const ctx = await browser.newContext()
    const page = await ctx.newPage()
    await page.goto("http://naver.com")

    await page.waitForSelector('#query')
    await page.fill('#query', '천안 맛집')
    await page.click('#search-btn')
    await page.screenshot({
        path: 'a.png',
        full_page: true
    })
    browser.close()
}

