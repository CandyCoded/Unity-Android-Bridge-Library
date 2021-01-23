build:
	ANDROID_SDK_ROOT=~/Library/Android/sdk ./gradlew build
	mkdir -p dist && find app -type f -name "*.aar" -exec cp {} ./dist \;

clean:
	git clean -xdf

.PHONY: build
