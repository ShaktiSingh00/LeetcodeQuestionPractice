/**
 * @param {string[]} words
 * @return {string[]}
 */
var stringMatching = function(words) {
   words.sort((a, b) => a.length - b.length);

    const result = [];

    for (let i = 0; i < words.length; i++) {
        for (let j = i + 1; j < words.length; j++) {
            // Check if words[i] is a substring of words[j]
            if (words[j].includes(words[i])) {
                result.push(words[i]);
                break; // No need to check further for this word
            }
        }
    }

    return result;
    
};