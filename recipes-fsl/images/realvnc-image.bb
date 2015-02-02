# Copyright (C) 2014-2015 RealVNC Ltd.  All Rights Reserved.

include recipes-graphics/images/core-image-x11.bb
IMAGE_FEATURES += "debug-tweaks"
SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"
# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${SOC_EXTRA_IMAGE_FEATURES} \
    nfs-server \
    ssh-server-openssh \
    tools-debug \
    tools-profile \
    qt4-pkgs \
"
SOC_IMAGE_INSTALL = ""
SOC_IMAGE_INSTALL_mx5 = "glcubes-demo"
IMAGE_INSTALL += " \
    ${SOC_IMAGE_INSTALL} \
    cpufrequtils \
    nano \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    qt4-plugin-phonon-backend-gstreamer \
    qt4-demos \
    qt4-examples \
    gpu-viv-g2d \
    xf86-video-fbdev \
    valgrind \
    vim \
    screen \
    strace \
    xclock \
    xev \
    xterm \
    zip \
    bzip2 \
    xcb-util \
    xcb-util-image \
    xcb-util-keysyms \
    xcb-util-renderutil \
    xcb-util-wm \
    icu \
    dhcp-server \
    dhcp-client \
    procps \
    python-argparse \
    python-psutil \
    iw \
    linux-firmware \
    libpcap \
    realvnc-extra \
    realvnc-ar6003-firmware \
    realvnc-compat-wireless \
"
export IMAGE-BASENAME = "realvnc-image"
