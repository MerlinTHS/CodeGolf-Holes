package io.mths.golf.isbn

fun main(a: Array<String>) {
    for(b in a)
        println(
            b + ((11-b.replace("-","")
                .foldIndexed(0){i,r,c-> r+c.digitToInt()*(10-i) } % 11) % 11)
                .let{ if(it>9)'X' else it.digitToChar() }
        )
}

// fun main(a:Array<String>){for(b in a)println(b+((11-b.replace("-","").foldIndexed(0){i,r,c->r+c.digitToInt()*(10-i)}%11)%11).let{if(it>9)'X' else it.digitToChar()})}