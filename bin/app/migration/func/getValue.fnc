GETVALUE()
{

	# 引数チェック
	if [ $# -ne 2 ] ;then
		return 1
	else
		FNAME="$1"
		ID="$2"
	fi

	cat ${FNAME} | while read F1 F2
	do
		if [ "${F1}" = "${ID}" ] ;then
			echo ${F2}
			break
		fi
	done
}
