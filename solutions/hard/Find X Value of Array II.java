// Title: Find X Value of Array II
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/find-x-value-of-array-ii/

            int x = queries[i][3];

            tree.update(index, value);

            Info result = tree.query(start, nums.length);
            answer[i] = result.ways[x];
        }

        return answer;
    }
}
