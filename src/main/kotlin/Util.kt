class Util {
    companion object {
        const val appName = "Burp-No-HTTP-Caching"
        const val appVersion = "1.0.0"
        val headers = arrayListOf(
            Pair("Cache-Control", "no-store, no-cache, must-revalidate, proxy-revalidate, max-age=0")
        )
    }
}