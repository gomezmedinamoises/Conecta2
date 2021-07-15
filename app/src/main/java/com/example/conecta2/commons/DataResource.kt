package com.example.conecta2.commons

data class DataResource<out T>(val status: Status, val resourceData: T?, var errorCode: String?) {
    companion object {
        fun <T> success(data: T?): DataResource<T> {
            return DataResource(
                Status.SUCCESS,
                data,
                null
            )
        }

        fun <T> error(errorCode: String, data: T? = null): DataResource<T> {
            return DataResource(
                Status.ERROR,
                data,
                errorCode
            )
        }
    }

    enum class Status {
        SUCCESS,
        ERROR
    }
}
