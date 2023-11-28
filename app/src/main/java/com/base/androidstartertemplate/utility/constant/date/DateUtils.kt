package com.base.androidstartertemplate.utility.constant.date

import com.base.androidstartertemplate.utility.Logger
import java.text.SimpleDateFormat
import java.util.*

class DateUtils {

    companion object {

        private const val TAG = "DateUtils"

        /**
         * This functions returns the timezone of the user.
         *
         * @return TimeZone
         *
         * @author Shweta Fulzele
         */
        fun getDefaultTimezone(): TimeZone {
            return DateConstants.DEFAULT_TIMEZONE
        }

        /**
         * This function returns the current date and time of the user's device
         * in the required date format
         *
         * @param dateFormat The format in which the date and time is to be
         * returned from the function
         *
         * @return String
         *
         * @author Shweta Fulzele
         */
        fun getCurrentTime(dateFormat: String): String {
            return SimpleDateFormat(dateFormat,Locale.getDefault()).format(Date())
        }

        /**
         * This function returns the current date and time of the user's device
         * in the required date format and locale.
         *
         * @param dateFormat The format in which the date and time is to be
         * returned from the function.
         *
         * @param locale The locale in which the function should convert the date
         * and return it to the caller function.
         *
         * @return String
         *
         * @author Shweta Fulzele
         */
        fun getCurrentTime(dateFormat: String, locale: Locale): String {
            return SimpleDateFormat(dateFormat,locale).format(Date())
        }

        /**
         *
         * This function returns the date and time of the provided date and time
         * into the provided date format to the caller function.
         *
         * @param date The Date object which has the date and time to be converted
         * into the provided date format.
         *
         * @param dateFormat The String which contains the date format in which the
         * date object is to be converted and returned to the caller function.
         *
         * @return String
         *
         * @author Shweta Fulzele
         */
        fun getDefinedTime(date: Date, dateFormat: String): String {
            return SimpleDateFormat(dateFormat, Locale.getDefault()).format(date)
        }

        /**
         *
         * This function returns the date and time of the provided date and time
         * into the provided date format to the caller function.
         *
         * @param date The Date object which has the date and time to be converted
         * into the provided date format.
         *
         * @param dateFormat The String which contains the date format in which the
         * date object is to be converted and returned to the caller function.
         *
         * @param locale The locale in which the function should convert the date
         * and return it to the caller function.
         *
         * @return String
         *
         * @author Shweta Fulzele
         *
         */
        fun getDefinedTime(date: Date, dateFormat: String, locale: Locale): String {
            return SimpleDateFormat(dateFormat, locale).format(date)
        }

        fun getDateFromString(date: String, dateFormat: String): Date {
            return try {
                SimpleDateFormat(dateFormat, Locale.getDefault()).parse(date) ?: Date()
            } catch (ex: Exception) {
                Logger.error(TAG, ex.message ?: ex.toString())
                Date()
            }
        }

        fun getDateFromString(date: String, dateFormat: String, locale: Locale): Date {
            return try {
                SimpleDateFormat(dateFormat, locale).parse(date) ?: Date()
            } catch (ex: Exception) {
                Logger.error(TAG, ex.message ?: ex.toString())
                Date()
            }
        }

        fun convertDate(date: String, inputDateFormat: String, outputDateFormat: String): String {
            val inputFormatter = SimpleDateFormat(inputDateFormat, Locale.getDefault())
            return try {
                val parsedDate = inputFormatter.parse(date)
                parsedDate?.let { SimpleDateFormat(outputDateFormat, Locale.getDefault()).format(it) }
                    ?:date
            } catch (ex: Exception) {
                Logger.error(TAG, ex.message ?: ex.toString())
                date
            }
        }

        fun convertDate(date: String, inputDateFormat: String, outputDateFormat: String, outputLocale: Locale, commonLocale: Boolean = false): String {
            var inputFormatter = SimpleDateFormat(inputDateFormat, Locale.getDefault())
            if (commonLocale) {
                inputFormatter = SimpleDateFormat(inputDateFormat, outputLocale)
            }
            return try {
                val parsedDate = inputFormatter.parse(date)
                parsedDate?.let { SimpleDateFormat(outputDateFormat, outputLocale).format(it) }
                    ?:date
            } catch (ex: Exception) {
                Logger.error(TAG, ex.message ?: ex.toString())
                date
            }
        }

        fun convertDate(date: String, inputDateFormat: String, outputDateFormat: String, inputLocale: Locale, outputLocale: Locale): String {
            val inputFormatter = SimpleDateFormat(inputDateFormat, inputLocale)
            return try {
                val parsedDate = inputFormatter.parse(date)
                parsedDate?.let { SimpleDateFormat(outputDateFormat, outputLocale).format(it) }
                    ?:date
            } catch (ex: Exception) {
                Logger.error(TAG, ex.message ?: ex.toString())
                date
            }
        }
    }
}