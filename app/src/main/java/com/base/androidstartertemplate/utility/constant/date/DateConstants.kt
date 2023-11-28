package com.base.androidstartertemplate.utility.constant.date

import java.util.*

class DateConstants {

    companion object {
        /**
         * Returns the Timezone of the location / region where the
         * user is currently using the application.
         *
         * @author Shweta Fulzele
         */
        val DEFAULT_TIMEZONE: TimeZone = TimeZone.getDefault()

        /**
         * Format - yyyy
         *
         * Example - 2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyy = "yyyy"

        /**
         * Format - MM
         *
         * Example - 10
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MM = "MM"

        /**
         * Format - dd
         *
         * Example - 17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_dd = "dd"

        /**
         * Format - ZZZ
         *
         * Example - +0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ZZZ = "ZZZ"

        /**
         * Format - XXX
         *
         * Example - +05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_XXX = "XXX"

        /**
         * Format - yyyy-MM-dd
         *
         * Example - 2022-10-17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_HYPHEN_yyyyMMdd = "yyyy-MM-dd"

        /**
         * Format - MM-dd-yyyy
         *
         * Example - 10-17-2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_HYPHEN_MMddyyyy = "MM-dd-yyyy"

        /**
         * Format - dd-MM-yyyy
         *
         * Example - 17-10-2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_HYPHEN_ddMMyyyy = "dd-MM-yyyy"

        /**
         * Format - yyyy/MM/dd
         *
         * Example - 2022/10/17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_SLASH_yyyyMMdd = "yyyy/MM/dd"

        /**
         * Format - MM/dd/yyyy
         *
         * Example - 10/17/2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_SLASH_MMddyyyy = "MM/dd/yyyy"

        /**
         * Format - dd/MM/yyyy
         *
         * Example - 17/10/2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_SLASH_ddMMyyyy = "dd/MM/yyyy"

        /**
         * Format - yyyy-MM-dd'T'HH:mm:ss
         *
         * Example - 2022-10-17T17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMddTHHmmss = "yyyy-MM-dd'T'HH:mm:ss"

        /**
         * Format - yyyy-MM-dd'T'HH:mm:ss.SSS
         *
         * Example - 2022-10-17T17:10:29.018
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMddTHHmmssSSS = "yyyy-MM-dd'T'HH:mm:ss.SSS"

        /**
         * Format - MM-dd-yyyy'T'HH:mm:ss.SSS
         *
         * Example - 10-17-2022T17:10:29.018
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyyTHHmmssSSS = "MM-dd-yyyy'T'HH:mm:ss.SSS"

        /**
         * Format - MM-dd-yyyy'T'HH:mm:ss
         *
         * Example - 10-17-2022T17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyyTHHmmss = "MM-dd-yyyy'T'HH:mm:ss"

        /**
         * Format - dd-MM-yyyy'T'HH:mm:ss
         *
         * Example - 17-10-2022T17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyyTHHmmss = "dd-MM-yyyy'T'HH:mm:ss"

        /**
         * Format - dd-MM-yyyy'T'HH:mm:ss.SSS
         *
         * Example - 17-10-2022T17:10:29.018
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyyTHHmmssSSS = "dd-MM-yyyy'T'HH:mm:ss.SSS"

        /**
         * Format - yyyy-MM-dd'T'HH:mm:ssXXX
         *
         * Example - 2022-10-17T17:10:29+05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMddTHHmmssXXX = "yyyy-MM-dd'T'HH:mm:ssXXX"

        /**
         * Format - yyyy-MM-dd'T'HH:mm:ssZZZ
         *
         * Example - 2022-10-17T17:10:29+0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMddTHHmmssZZZ = "yyyy-MM-dd'T'HH:mm:ssZZZ"

        /**
         * Format - yyyy-MM-dd'T'HH:mm:ss.SSSXXX
         *
         * Example - 2022-10-17T17:10:29.018+05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMddTHHmmssSSSXXX = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"

        /**
         * Format - yyyy-MM-dd'T'HH:mm:ss.SSSZZZ
         *
         * Example - 2022-10-17T17:10:29.018+0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMddTHHmmssSSSZZZ = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZ"

        /**
         * Format - MM-dd-yyyy'T'HH:mm:ssXXX
         *
         * Example - 10-17-2022T17:10:29+05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyyTHHmmssXXX = "MM-dd-yyyy'T'HH:mm:ssXXX"

        /**
         * Format - MM-dd-yyyy'T'HH:mm:ssZZZ
         *
         * Example - 10-17-2022T17:10:29+0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyyTHHmmssZZZ = "MM-dd-yyyy'T'HH:mm:ssZZZ"

        /**
         * Format - MM-dd-yyyy'T'HH:mm:ss.SSSZZZ
         *
         * Example - 10-17-2022T17:10:29.018+0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyyTHHmmssSSSZZZ = "MM-dd-yyyy'T'HH:mm:ss.SSSZZZ"

        /**
         * Format - MM-dd-yyyy'T'HH:mm:ss.SSSXXX
         *
         * Example - 10-17-2022T17:10:29.018+05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyyTHHmmssSSSXXX = "MM-dd-yyyy'T'HH:mm:ss.SSSXXX"

        /**
         * Format - dd-MM-yyyy'T'HH:mm:ssXXX
         *
         * Example - 10-17-2022T17:10:29+05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyyTHHmmssXXX = "dd-MM-yyyy'T'HH:mm:ssXXX"

        /**
         * Format - dd-MM-yyyy'T'HH:mm:ss.SSSXXX
         *
         * Example - 17-10-2022T17:10:29.018+05:30
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyyTHHmmssSSSXXX = "dd-MM-yyyy'T'HH:mm:ss.SSSXXX"

        /**
         * Format - dd-MM-yyyy'T'HH:mm:ssZZZ
         *
         * Example - 17-10-2022T17:10:29+0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyyTHHmmssZZZ = "dd-MM-yyyy'T'HH:mm:ssZZZ"

        /**
         * Format - dd-MM-yyyy'T'HH:mm:ss.SSSZZZ
         *
         * Example - 17-10-2022T17:10:29.018+0530
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyyTHHmmssSSSZZZ = "dd-MM-yyyy'T'HH:mm:ss.SSSZZZ"

        /**
         * Format - MMM
         *
         * Example - Oct
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMM = "MMM"

        /**
         * Format - MMMM
         *
         * Example - October
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMMM = "MMMM"

        /**
         * Format - E
         *
         * Example - M (Monday)
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_E = "E"

        /**
         * Format - EEE
         *
         * Example - Mon
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE = "EEE"

        /**
         * Format - EEEE
         *
         * Example - Monday
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEEE = "EEEE"

        /**
         * Format - yyyy-MM-dd HH:mm:ss
         *
         * Example - 2022-10-17 17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMdd_HHmmss = "yyyy-MM-dd HH:mm:ss"

        /**
         * Format - yyyy-MM-dd hh:mm:ss a
         *
         * Example - 2022-10-17 05:10:29 PM
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_yyyyMMdd_hhmmss_a = "yyyy-MM-dd hh:mm:ss a"

        /**
         * Format - MM-dd-yyyy HH:mm:ss
         *
         * Example - 10-17-2022 17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyy_HHmmss = "MM-dd-yyyy HH:mm:ss"

        /**
         * Format - MM-dd-yyyy hh:mm:ss a
         *
         * Example - 10-17-2022 05:10:29 PM
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_MMddyyyy_hhmmss_a = "MM-dd-yyyy hh:mm:ss a"

        /**
         * Format - dd-MM-yyyy HH:mm:ss
         *
         * Example - 17-10-2022 17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyy_HHmmss = "dd-MM-yyyy HH:mm:ss"

        /**
         * Format - dd-MM-yyyy hh:mm:ss a
         *
         * Example - 17-10-2022 05:10:29 PM
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_ddMMyyyy_hhmmss_a = "dd-MM-yyyy hh:mm:ss a"

        /**
         * Format - HH:mm:ss.SSS
         *
         * Example - 17:10:29.018
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_HHmmssSSS = "HH:mm:ss.SSS"

        /**
         * Format - HH:mm:ss
         *
         * Example - 17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_HHmmss = "HH:mm:ss"

        /**
         * Format - hh:mm:ss a
         *
         * Example - 05:10:29 PM
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_hhmmss_a = "hh:mm:ss a"

        /**
         * Format - dd MMM yyyy
         *
         * Example - 17 Oct 2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_dd_MMM_yyyy = "dd MMM yyyy"

        /**
         * Format - dd MMM
         *
         * Example - 17 Oct
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_dd_MMM = "dd MMM"

        /**
         * Format - dd MMMM yyyy
         *
         * Example - 17 October 2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_dd_MMMM_yyyy = "dd MMMM yyyy"

        /**
         * Format - dd MMMM
         *
         * Example - 17 October
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_dd_MMMM = "dd MMMM"

        /**
         * Format - EEE dd MMM HH:mm
         *
         * Example - Mon 17 Oct 17:10
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_dd_MMM_HHmm = "EEE dd MMM HH:mm"

        /**
         * Format - EEE dd MMM HH:mm:ss
         *
         * Example - Mon 17 Oct 17:10:29
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_dd_MMM_HHmmss = "EEE dd MMM HH:mm:ss"

        /**
         * Format - EEE dd MMM hh:mm:ss a
         *
         * Example - Mon 17 Oct 05:10:29 PM
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_dd_MMM_hhmmss_a = "EEE dd MMM hh:mm:ss a"

        /**
         * Format - EEE dd MMM hh:mm a
         *
         * Example - Mon 17 Oct 17:10 PM
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_dd_MMM_hhmm_a = "EEE dd MMM hh:mm a"

        /**
         * Format - EEE yyyy-MM-dd
         *
         * Example - Mon 2022-10-17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_yyyyMMdd = "EEE yyyy-MM-dd"

        /**
         * Format - EEEE yyyy-MM-dd
         *
         * Example - Monday 2022-10-17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEEE_yyyyMMdd = "EEEE yyyy-MM-dd"

        /**
         * Format - EEE MM-dd-yyyy
         *
         * Example - Mon 10-17-2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_MMddyyyy = "EEE MM-dd-yyyy"

        /**
         * Format - EEEE MM-dd-yyyy
         *
         * Example - Monday 10-17-2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEEE_MMddyyyy = "EEEE MM-dd-yyyy"

        /**
         * Format - EEE, yyyy-MM-dd
         *
         * Example - Mon, 2022-10-17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_COMMA_yyyyMMdd = "EEE, yyyy-MM-dd"

        /**
         * Format - EEEE, yyyy-MM-dd
         *
         * Example - Monday, 2022-10-17
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEEE_COMMA_yyyyMMdd = "EEEE, yyyy-MM-dd"

        /**
         * Format - EEE, MM-dd-yyyy
         *
         * Example - Mon, 10-17-2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEE_COMMA_MMddyyyy = "EEE, MM-dd-yyyy"

        /**
         * Format - EEEE, MM-dd-yyyy
         *
         * Example - Monday, 10-17-2022
         *
         * @author Shweta Fulzele
         */
        const val FORMAT_EEEE_COMMA_MMddyyyy = "EEEE, MM-dd-yyyy"
    }

}