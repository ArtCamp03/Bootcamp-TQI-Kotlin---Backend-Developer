package listas

class set {

    fun principal(){
        val openIssues: MutableSet<String> = mutableSetOf("uniqueDescri", "uniqueDescri2", "UniqueDescri3")

        fun addIssue(uniqueDesc: String): Boolean{
            return openIssues.add(uniqueDesc)
        }

        fun getStatusLog(isAdded: Boolean): String{
            return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
        }

        fun man(){
            val aNewIssue: String = "uniqueDescr4"
            val anIssueALreadyIn: String = "uniqueDescr2"

            println("Issue $aNewIssue $(getStatusLog(addIssue(aNewIssue)))")
            println("Issue $anIssueALreadyIn $(getStatusLog(addIssue(anIssueALreadyIn)))")
        }

    }

}