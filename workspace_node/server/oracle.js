const oracle = require('oracledb')
oracle.initOracleClient({
    libDir: 'D:\\tools\\instantclient-basic-windows.x64-23.9.0.25.07\\instantclient_23_9'
})


// getEmp()


async function getEmp(){

    let conn

    try{
        // DB 접속
        conn = await oracle.getConnection({
            connectionString: '125.181.132.133:51521/xe',
            user: 'scott4_19',
            password: 'tiger'
        })

        // sql 준비
        const query = ' select * from emp'

        // sql 실행 및 결과 확보
        const result = await conn. execute(query, [], {
            outFormat: oracle.OUT_FORMAT_OBJECT
        })

        // 결과 활용
        console.log('result', result)

    }catch(err){
        console.log('>>> ERR >>>', err)
    }finally {
        if(conn){
            try{
                await conn.close()
            }catch(err){
                console.log('>>> finally > ERR >>>', err)
            }
        }

    }
}

// getDeptno(20)

async function getDeptno(deptno){

    let conn
    let result = {}
    try{
        // DB 접속
        conn = await oracle.getConnection({
            connectionString: '125.181.132.133:51521/xe',
            user: 'scott4_19',
            password: 'tiger'
        })

        // sql 준비
        // : 이 변수를 뜻함
        const query = ' select * from emp where deptno = :deptno'

        // sql 실행 및 결과 확보
        result = await conn. execute(query, [deptno], {
            outFormat: oracle.OUT_FORMAT_OBJECT
        })

        // 결과 활용
        // console.log('result', result)

        // length 확인
        console.log('length', result.rows.length)
        
        // 하나씩 확인
        console.log('첫번째', result.rows[0].ENAME)


    }catch(err){
        console.log('>>> ERR >>>', err)
    }finally {
        if(conn){
            try{
                await conn.close()
            }catch(err){
                console.log('>>> finally > ERR >>>', err)
            }
        }

    }

    return result
}

// 여기 안에 적은 것만 다른 파일에서 쓸수 있음
module.exports = {
    // d : getDeptno
    // 외부사용 : 내부사용
    getDeptno : getDeptno
    // 외부내부 같으면 하나만 써도 됨.
    // getDeptno
}