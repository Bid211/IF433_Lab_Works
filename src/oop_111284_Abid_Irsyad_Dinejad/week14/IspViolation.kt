package oop_111284_Abid_Irsyad_Dinejad.week14

interface MultifunctionDevice {
    fun print(doc: String)
    fun scan(doc: String) : String
    fun fax(doc: String)
}

class SimplePrinter : MultifunctionDevice {
    override fun print(doc: String) = println("Printing: $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("No Scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("No fax")
}
