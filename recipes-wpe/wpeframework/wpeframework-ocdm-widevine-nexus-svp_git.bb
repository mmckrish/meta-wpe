SUMMARY = "WPE Framework OpenCDMi module for Widevine Nexus SVP"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

require include/wpeframework-plugins.inc

DEPENDS += " broadcom-refsw"

SRC_URI = "git://git@github.com/WebPlatformForEmbedded/OCDM-Widevine-Nexus-SVP.git;protocol=https;branch=master"
SRCREV = "488a0dc406a7a2333c54b3bb59e56ce2b35552a2"

FILES_${PN} = "${datadir}/WPEFramework/OCDM/*.drm"
