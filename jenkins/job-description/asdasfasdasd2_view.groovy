 
listView('asdasfasdasd2 Jobs') {
    description('asdasfasdasd2 Jobs')
    jobs {
        regex('asdasfasdasd2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
