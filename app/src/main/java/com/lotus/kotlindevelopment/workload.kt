package com.lotus.kotlindevelopment

class workload(  day:String,  dayleft:String,  type:String,  course:String,  id:String)
{
    var day:String = day
    var dayleft:String = dayleft;
    var type:String = type;
    var course:String = course;
    var id:String = id;

    fun insert(day:String, dayleft: String, type: String, course:String, id:String)
    {
        this.day = day;
        this.dayleft = dayleft;
        this.type = type;
        this.course = course;
        this.id = id;
    }

}