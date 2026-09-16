// Title: Check if Object Instance of Class
            // Difficulty: Medium
            // Language: JavaScript
            // Link: https://leetcode.com/problems/check-if-object-instance-of-class/

            return true;
        }

        obj = Object.getPrototypeOf(obj);

    }

    return false;
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */
