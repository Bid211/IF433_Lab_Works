package oop_111284_Abid_Irsyad_Dinejad.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}