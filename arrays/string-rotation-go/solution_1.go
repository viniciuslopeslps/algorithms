//waterbottle
//water bottle

////bottlewater

//water'bottlewater'bottle

func stringRotation(s1, s2 string) bool {
	if len(s1) > 0 && len(s2) > 0 {
		return isSubstring(s1+s1, s2)
	}

	return false
}