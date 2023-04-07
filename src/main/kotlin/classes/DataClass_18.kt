package classes

data class importantData(
    val userName: String,
    val email: String,
    val name: String,
    val password: String
) {
}

fun main() {
    val dataList = mutableListOf<importantData>()

    dataList.add(
        importantData(
            userName = "Rhythamnegi",
            email = "rhytham@example.com",
            name = "Rhytham Negi",
            password = "Qsdhfk@3332"
        )
    )

    dataList.add(
        importantData(
            userName = "JohnDoe",
            email = "johndoe@example.com",
            name = "John Doe",
            password = "Passw0rd@123"
        )
    )

    dataList.add(
        importantData(
            userName = "AliceSmith",
            email = "alicesmith@example.com",
            name = "Alice Smith",
            password = "Alic3@456"
        )
    )

    dataList.add(
        importantData(
            userName = "BobLee",
            email = "boblee@example.com",
            name = "Bob Lee",
            password = "B0bL33@789"
        )
    )

    dataList.add(
        importantData(
            userName = "EmmaJones",
            email = "emmajones@example.com",
            name = "Emma Jones",
            password = "Emm@J0n3s@101"
        )
    )

    dataList.add(
        importantData(
            userName = "DavidBrown",
            email = "davidbrown@example.com",
            name = "David Brown",
            password = "D@v1dB@202"
        )
    )

    dataList.add(
        importantData(
            userName = "LisaWang",
            email = "lisawang@example.com",
            name = "Lisa Wang",
            password = "L1s@W@ng@303"
        )
    )

    dataList.add(
        importantData(
            userName = "JamesWilson",
            email = "jameswilson@example.com",
            name = "James Wilson",
            password = "J@m3sW@404"
        )
    )

    dataList.add(
        importantData(
            userName = "AnnaTaylor",
            email = "annataylor@example.com",
            name = "Anna Taylor",
            password = "Ann@T@yl0r@505"
        )
    )

    dataList.add(
        importantData(
            userName = "MarkDavis",
            email = "markdavis@example.com",
            name = "Mark Davis",
            password = "M@rkD@v1s@606"
        )
    )

    dataList.add(
        importantData(
            userName = "SaraMiller",
            email = "saramiller@example.com",
            name = "Sara Miller",
            password = "S@r@M1ll3r@707"
        )
    )

    println(dataList.toString())
}