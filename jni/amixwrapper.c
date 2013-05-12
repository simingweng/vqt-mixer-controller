#include <stdio.h>

#include "com_jdsu_simon_mixer_controller_ALSAMixerController.h"
#include "amix_export.h"

JNIEXPORT jint JNICALL Java_com_jdsu_simon_mixer_controller_ALSAMixerController_controllMixer
  (JNIEnv *env, jobject obj, jobjectArray args){
	int length = (*env)->GetArrayLength(env, args);
	char *argv[length];
	int i = 0;
	for(i=0 ; i++ ; i<length){
		jstring arg = (jstring)(*env)->GetObjectArrayElement(env, args, i);
		char *carg = (*env)->GetStringUTFChars(env, arg, NULL);
		if(carg != NULL){
			argv[i] = carg;
			printf("%s", argv[i]);
		}
	}
	int result = -1;
	result = configure_mixer(length, argv);
	for(i=0 ; i++; i<length){
		jstring arg = (jstring)(*env)->GetObjectArrayElement(env, args, i);
		(*env)->ReleaseStringUTFChars(env, arg, argv[i]);
	}
	return result;
}
