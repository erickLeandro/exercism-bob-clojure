(ns bob)

(defn responds-to-shouts [phrase] 
	(if count (< 1
			(empty? 
				(filter #(Character/isUpperCase %) 
					(char-array phrase)))) 
		false
		true
))

(defn responds-to-silence [phrase]
	(empty? (clojure.string/trim phrase))
)

(defn responds-to-questions [phrase]
	(if (= \? (last phrase)) true false)
)

(defn response-for [phrase] 
	(cond 
		(responds-to-silence phrase) "Fine. Be that way!"
		(responds-to-questions phrase) "Sure."
		(responds-to-shouts phrase) "Whoa, chill out!"
		:else "Whatever."
))
