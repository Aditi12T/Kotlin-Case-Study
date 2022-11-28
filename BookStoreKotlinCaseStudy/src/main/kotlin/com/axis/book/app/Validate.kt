package com.axis.book.app

import com.axis.book.Exception.InvalidbookException

class Validate {
    fun validateCategory(bookCategory:String){

        if ((bookCategory!="Science") && bookCategory!="Fiction" && bookCategory!="Technology" && bookCategory!="Others"){
            throw InvalidbookException("Invalid book Exception -category ")
        }
    }
    fun validatePrice(bookPrice:Double){
        if (bookPrice<0){
            throw InvalidbookException("Invalid book exception - price")
        }
    }

    fun validateBookId(bookId:String){
        if (!(bookId.startsWith("B") && (bookId.length==4)))
            throw InvalidbookException("Invalid book exception- bookId")
    }


}