#include "com_jdsu_simon_mixer_controller_ALSAMixerController.h"
#include "amix_export.h"

JNIEXPORT jint JNICALL Java_com_jdsu_simon_mixer_controller_ALSAMixerController_controllMixer
  (JNIEnv *env, jobject obj, jobjectArray args){
	char *argv[2];
	argv[0] = "mixer_control_name";
	argv[1] = "1";
	return configure_mixer(2, argv);
}
