pipeline {
    agent any  // 指定在任何可用的 Jenkins 节点上运行

    tools {
        maven 'maven'  // Jenkins 中配置的 Maven 版本
    }

    stages {
        stage('Checkout') {
            steps {
                // 从 GitHub 拉取代码
                git branch: 'master', url: 'https://github.com/di-yong/JupiterToysAutomation.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                // 使用 Maven 安装项目依赖并编译项目
                echo 'Installing dependencies...'
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                // 使用 Maven 运行 Selenium 测试
                echo 'Running tests...'
                bat 'mvn test'
            }
        }
    }
//
//     post {
//         always {
//             // 存储生成的报告文件
//             archiveArtifacts artifacts: '**/target/*.html', allowEmptyArchive: true
//             // 收集测试结果报告
//             junit 'target/surefire-reports/*.xml'
//         }
//     }
}
