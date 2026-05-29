package oop_111284_Abid_Irsyad_Dinejad.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String) : String
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing Securely: $doc")
}