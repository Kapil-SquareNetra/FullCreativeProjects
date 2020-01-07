package com.example.kotlinexamples.SamplePrograms.Task

var elders: ArrayList<ElderClass> = arrayListOf()
var young: ArrayList<YoungClass> = arrayListOf()

fun main() {


    var input: Int?

    do {
        println("1. Elder Registration\n2. Elder Login\n3. Care Taker Registration\n4. Care Taker Login\n5. Display all Elders\n6. Display all Care Takers\n7. Exit\nEnter your choice: ")

        input = readLine()?.toInt()
        when (input) {
            1 -> elderRegistration()

            2 -> elderLogin()

            3 -> youngRegistration()

            4 -> youngLogin()

            5 -> showElderDetails()

            6 -> showCareTakerDetails()

            7 -> return

            else -> println("Enter a proper menu value")
        }


    } while (input != 7)


}


//-----------------------Elder----------------------------------

fun elderRegistration() {
    var eld = ElderClass()
    println("Enter your Name: ")
    eld.elderName = readLine()
    println("Enter a Username: ")
    eld.elderUserName = readLine()
    println("Enter a Password: ")
    eld.elderPassword = readLine()
    var id = elders.size + 1
    eld.elderID = id
    elders.add(eld)
    println("User Registered")

}

fun elderLogin() {
    print("UserName: ")
    var name: String? = readLine()
    print("Password: ")
    var pass: String? = readLine()
    var checkLogin =
        elders.find { i: ElderClass -> (i.elderUserName == name && i.elderPassword == pass) }
    if (checkLogin != null) {
        println("Login Successful!!")
        println("welcome ${checkLogin.elderName}!\n")
        do {
            println("1. Allocate Funds\n2. Approve CareTaker\n3. Rate CareTaker\n4. Exit\nEnter your choice:")
            var eInput = readLine()?.toInt()
            when (eInput) {
                1 -> allocateFunds(
                    checkLogin
                )
                2 -> approveCareTaker(
                    checkLogin
                )
                3 -> rateCareTaker(
                    checkLogin
                )
                4 -> return
                else -> println("Enter a proper menu value")
            }

        } while (eInput != 4)
    } else {
        println("Elder not found in register")
    }
}

fun showElderDetails() {
    println("Showing all elders")
    for (eld in elders) {
        println("Name: ${eld.elderName}")
        println("Status: ${eld.elderStatus}")
        if (eld.elderStatus.equals("Approved")) println("Care Taker: ${(young.find { i -> i.youngID == eld.careTakerID })?.youngName}")
        println("Rating: ${eld.elderRating}")
        println("Review: ${eld.elderReview}")

    }

}

fun allocateFunds(values: ElderClass) {
    print("Enter your value in Rupees to allocate fund: ")
    values.allocatedFund = readLine()?.toInt()
}

fun approveCareTaker(values: ElderClass) {
    if (values.careTakerID != null) {
        var careTaker = young.find { i -> i.youngID == values.careTakerID }
        careTaker?.youngName.let {
            println("Your assigned careTaker is: $it")
            println("Do you approve?\n1.Yes\n2.No\n3.Exit\nEnter your choice:")
            var choice = readLine()?.toInt()
            if (choice == 1) {
                for (i in careTaker!!.elderDetails)
                    if (i?.id == values.elderID) {
                        i?.status = "Approved"
                        println("Care Taker Approved!")
                    }
            } else if (choice == 2) {
                for (i in careTaker!!.elderDetails) {
                    if (i?.id == values.elderID) {
                        i?.status = "Rejected"
                        println("Care Taker rejected!")
                    }
                }
            }


        }

    }
}

fun rateCareTaker(values: ElderClass) {
    if (values.careTakerID != null) {
        var careTaker = young.find { i -> i.youngID == values.careTakerID }
        careTaker?.youngName.let {
            println("Your assigned careTaker is: $it")
            println("Enter your rating for $it : ")
            var rat = readLine()?.toInt()
            println("Enter your review for $it : ")
            var rev = readLine()
            for (i in careTaker!!.elderDetails)
                if (i?.id == values.elderID) {
                    i?.rating = rat
                    i?.review = rev
                    println("Review updated!")
                }

        }
    }
}


//----------------------Young-----------------------------------

fun youngRegistration() {
    var yng = YoungClass()
    println("Enter your Name: ")
    yng.youngName = readLine()
    println("Enter a Username: ")
    yng.youngUserName = readLine()
    println("Enter a Password: ")
    yng.youngPassword = readLine()
    var id = young.size + 1
    yng.youngID = id
    young.add(yng)
    println("User Registered")

}

fun youngLogin() {
    print("UserName: ")
    var name: String? = readLine()
    print("Password: ")
    var pass: String? = readLine()
    var checkLogin =
        young.find { i: YoungClass -> (i.youngUserName == name && i.youngPassword == pass) }
    if (checkLogin != null) {
        println("Login Successful!!")
        println("welcome ${checkLogin.youngName}!\n")
        do {
            println("1. Choose Elders\n2. Status Check\n3. Rate Elder\n4. Exit\nEnter your choice:")
            var eInput = readLine()?.toInt()
            when (eInput) {
                1 -> chooseElders(
                    checkLogin
                )
                2 -> checkStatus(
                    checkLogin
                )
                3 -> rateElder(
                    checkLogin
                )
                4 -> return
                else -> println("Enter a proper menu value")
            }

        } while (eInput != 4)
    } else {
        println("Care Taker not found in register")
    }

}

fun showCareTakerDetails() {

    println("Care Taker Details")
    for (yng in young) {
        println("Name: ${yng.youngName}")
        if (yng.elderDetails != null) {
            println("List of elders under care")
            for (i in yng.elderDetails) {
                println("Elder Name: ${(elders.find { k -> k.elderID == i?.id })?.elderName}")
                println("Elder Status: ${i?.status}")
                println("Elder's Rating: ${i?.rating}")
                println("Elder's Review: ${i?.review}")
            }

        }

    }

}

fun chooseElders(value: YoungClass) {
    println("Displaying Elders list")
    for (j in elders)
        println("${j.elderID} : ${j.elderName}")

    print("\nEnter your choice:")
    var choice = readLine()?.toInt() ?: 0
    var elderDtls: ElderClass? = null
    if (elders.any { i: ElderClass -> (i.elderID == choice) }) {
        elderDtls = elders.find { i: ElderClass -> (i.elderID == choice) }
        elderDtls?.careTakerID = value.youngID
        elderDtls?.elderStatus = "Requested"
    }

    for (i in 0..3)
        if (value.elderDetails[i]?.id == null || value.elderDetails[i]?.status == "Rejected") {

            var status: StatusClass? =
                StatusClass()
            status?.id = elderDtls?.elderID
            status?.status = "Requested"
            value.elderDetails.set(i,
                StatusClass()
            )
            /*value.elderDetails[i]?.status =
            value.elderDetails[i]?.rating = null
            value.elderDetails[i]?.review = null*/
            break
        }

}

fun checkStatus(value: YoungClass) {
    for (i in value.elderDetails) {
        var name = elders.find { id -> id.elderID == i?.id }
        print("${name?.elderName} : ${i?.status}")
        if (i?.status.equals("Approved"))
            print(" : ${name?.allocatedFund ?: 0}")
        println("")
    }

}

fun rateElder(values: YoungClass) {

    if (values.elderDetails != null) {
        var i = 0
        for (k in values.elderDetails) {
            var elderDetail = elders.find { i -> i.elderID == k?.id }
            i++
            println("${elderDetail?.elderName}")
        }
        print("Enter the elder's name to give ratings:")
        var name = readLine()


        if (elders.any { j: ElderClass -> (j.elderName == name) }) {
            var found = elders.find { j: ElderClass -> (j.elderName == name) }
            println("Enter the rating for ${found?.elderName}: ")
            var rat = readLine()?.toInt()
            println("Enter the Review for $${found?.elderName}: ")
            var rev = readLine()
            found?.elderRating = rat
            found?.elderReview = rev
            println("Review Updated!")
        }

    }


}