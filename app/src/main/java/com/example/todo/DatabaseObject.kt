package com.example.todo
object DatabaseObject {
    var list_data = mutableListOf<ObjectInfo>()
    fun AddData(title: String , desc: String) {
        list_data.add(ObjectInfo(title, desc))
    }
    fun completeData(i:Int){
        list_data.removeAt(i)
    }
    fun getshowAllData(): List<ObjectInfo> {
        return list_data
    }
    fun getshowData(i:Int): ObjectInfo {
        return list_data[i]
    }
}